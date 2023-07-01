package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountConditon;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;
import app.product.Product;
import app.product.ProductRepository;

import java.util.Arrays;
import java.util.Scanner;

public class OrderApp {
    Scanner scanner = new Scanner(System.in);

    private ProductRepository productRepository;
    private Menu menu;
    private Cart cart;
    private Order order;

    public OrderApp(ProductRepository productRepository, Menu menu, Cart cart, Order order) {
        this.productRepository = productRepository;
        this.menu = menu;
        this.cart = cart;
        this.order = order;
    }

    public void run() {

//        ProductRepository productRepository = new ProductRepository();
//        Product[] products = productRepository.getAllProduct();
//        Menu menu = new Menu(products);
//        Cart cart = new Cart(productRepository, menu);
//        Order order = new Order(cart, new Discount(
//                new DiscountConditon[]{
//                        new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
//                        new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
//                }));
        System.out.println("[\uD83D\uDC68\u200D\uD83C\uDF73] BurgerQueen Order Service!");

        while (true) {
            menu.printMenu();
            String input = scanner.nextLine();

            if (input.equals("+")){
                order.makeOrder();

                break;
            }
            else{
                int menuNumber = Integer.parseInt(input);
                if (menuNumber == 0) cart.printCart();
                else if ( menuNumber >= 1&& menuNumber <= products.length) cart.addToCart(menuNumber);
            }



            // }
        }

    }
}
