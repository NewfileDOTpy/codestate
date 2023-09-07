//카페 손님
interface Customer {
    String getOrder();
}

class CafeCustomerA implements Customer {
    public String getOrder(){
        return "a glass of iced americano";
    }
    public String getOrder(int num){
        return "a glass of ice latte";
    }
}

class CafeCustomerB implements Customer {
    public String getOrder(){
        return "a glass of strawberry latte";
    }


}

class CafeOwner {
    public void giveItem(Customer customer) {
        System.out.println("Item : " + customer.getOrder());
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeowner = new CafeOwner();
        Customer cafeCustomerA = new CafeCustomerA();
        Customer cafeCustomerB = new CafeCustomerB();

        cafeowner.giveItem(cafeCustomerA);
        cafeowner.giveItem(cafeCustomerB);
        cafeowner.giveItem(cafeCustomerA);

        Person programmer = new Programmer();
        System.out.println(programmer instanceof Object);
        System.out.println(programmer instanceof Singer);
        System.out.println(programmer instanceof Person);
        System.out.println(programmer instanceof Programmer);
    }

}

class Person {};
class Programmer extends Person{};
class Singer extends Person{};


