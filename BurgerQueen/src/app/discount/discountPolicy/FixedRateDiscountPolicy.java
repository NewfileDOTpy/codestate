package app.discount.discountPolicy;

public class FixedRateDiscountPolicy implements DiscountPolicy {

    private int discountRate;

    public FixedRateDiscountPolicy(int discountRate) {
        this.discountRate = discountRate;
    }

    public int calculateDiscountedPrice(int price){
        return price -(price*discountRate/100);
        //원래 수식 price*(1-(discountRate/100); 이 안되었던 이유 ->
        //int 형이므로 discount/100을 할떄 0.2가 아닌 0으로 계산됨
        // 수식 변경 후 정상 작동
    }
}
