package app.discount.discountCondition;

public interface DiscountConditon {

    void checkDiscountCondition();
    int applyDiscount(int price);

    boolean isSatisfied();

}
