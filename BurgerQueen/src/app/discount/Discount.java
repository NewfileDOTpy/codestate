package app.discount;

import app.discount.discountCondition.DiscountConditon;

public class Discount {
    private DiscountConditon[] discountConditons;


    public Discount(DiscountConditon[] discountConditons) {
        this.discountConditons = discountConditons;
    }

    public int discount(int price){
        int finalPrice =price;

        for(DiscountConditon discountCondition : discountConditons){
            discountCondition.checkDiscountCondition();
            if(discountCondition.isSatisfied()) finalPrice = discountCondition.applyDiscount(finalPrice);
        } return finalPrice;
    }
}
