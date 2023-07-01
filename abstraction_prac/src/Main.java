import discount.BEDiscountCondition;
import discount.CozDiscountCondition;

public class Main {
    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk(new CozDiscountCondition(500) , new BEDiscountCondition(10));

        kiosk.operate();
    }
}


/*
 * 커피, 차 -> Coffee, Tea
 * 상품들의 목록 저장소 -> ProductRepository
 * 할인 조건 -> CozDiscountCondition
 * 프로그램의 메인 로직 -> Kiosk
 * */