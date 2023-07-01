package app;

import app.discount.Discount;
import app.discount.discountCondition.DiscountConditon;

public class Order {
    private Cart cart;

    private Discount discount;




    public Order(Cart cart, Discount discount) {
        this.cart = cart;
        this.discount = discount;
    }



    public void makeOrder(){
//        할인 메서드
//        CozDiscountCondition cozDiscountCondition = new CozDiscountCondition(new FixedRateDiscountPolicy(10));
//        KidDiscountCondition kidDiscountCondition = new KidDiscountCondition(new FixedAmountDiscountPolicy(500));
//
//
//        kidDiscountCondition.checkDiscountCondition();
//        int totalPrice = cart.calculateTotalPrice();
//        int finalPrice =totalPrice;
//
//        if (cozDiscountCondition.isSatisfied()) finalPrice = cozDiscountCondition.applyDiscount(finalPrice);
//        if (kidDiscountCondition.isSatisfied()) finalPrice = kidDiscountCondition.applyDiscount(finalPrice);
        int totalPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(totalPrice);



        System.out.println("[\uD83D\uDCE3] 주문이 완료되었습니다.");
        System.out.println("[\uD83D\uDCE3] 주문은 다음과 같습니다.");
        System.out.println("-".repeat(60));

        cart.printCartItmeDetails();

        System.out.println("-".repeat(60));
        System.out.printf("금액 합계       : %d원\n", totalPrice);
        System.out.printf("할인 적용 금액   : %d원\n", finalPrice);
        System.out.println("[\uD83D\uDCE3] 이용해주셔서 감사합니다.");
    }
}
