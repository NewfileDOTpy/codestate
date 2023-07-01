import discount.BEDiscountCondition;
import discount.CozDiscountCondition;
import products.Product;
import products.ProductRepository;

import java.util.Scanner;

public class Kiosk {

    private ProductRepository productRepository = new ProductRepository();
    private CozDiscountCondition cozDiscountCondition;
    private BEDiscountCondition beDiscountCondition;
    private Scanner scanner = new Scanner(System.in);

    public Kiosk(CozDiscountCondition cozDiscountCondition, BEDiscountCondition beDiscountCondition) {
        this.cozDiscountCondition = cozDiscountCondition;
        this.beDiscountCondition = beDiscountCondition;
    }

    public void operate() {

        printMenu();
        Product selectedProduct = chooseMenu();
        selectedProduct.applyOption();
        order(selectedProduct);
    }


    // Kiosk -> cozDiscountCondition
    // Kiosk -> Discondition -> cozDisountCondition, BEDiscountCondition
    private void order(Product selectedProduct) {
        int price = cozDiscountCondition.discount(selectedProduct.getPrice());
        price = beDiscountCondition.discount(price);
        //int price = discountCondition.discount(selectedProduct.getPrice());
        System.out.println("주문이 완료되었습니다. ");
        System.out.printf(
                "주문 상품 : %s %s\n",
                selectedProduct.getName(), selectedProduct.getOptionToString()
        );
        System.out.println("가격 : " + price);
    }

    private Product chooseMenu() {
        int selectedId = Integer.parseInt(scanner.nextLine());
        return productRepository.findById(selectedId);
    }

    private void printMenu() {
        System.out.println("# 메뉴");
        System.out.println("-".repeat(50));
        for (Product product : productRepository.getProducts()) {
            System.out.printf(
                    "(%d) %-15s %d\n",
                    product.getId(), product.getName(), product.getPrice()
            );
        }
        System.out.println("-".repeat(50));
        System.out.println("메뉴를 골라주세요.");
    }
}

