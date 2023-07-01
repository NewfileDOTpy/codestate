public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("테슬라 x", "쥐색");  // 객체 생성
        System.out.println(bmw.model);
        System.out.println(bmw.color);  // . 을 이용한 필드멤버 호
        System.out.println("--------");
        bmw.power();
        bmw.accelerate();
        bmw.stop();         // . 을 이용한 메서드 사용
    }
}
class Car{
    String model;
    String color;
    public Car(String model, String color){ //인스턴스 초기화를 위한 생성자 함수
        this.model = model;
        this.color = color;
    }
    void power(){
        System.out.println("시동을 걸었습니다");
    }
    void accelerate(){
        System.out.println("가속합니다");
    }
    void stop(){
        System.out.println("정지합니다.");
    }
}