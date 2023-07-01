package app;

public class Main {
    public static void main(String[] args) {
        AppConfiguerer appConfiguerer = new AppConfiguerer();


        OrderApp orderApp = new OrderApp(
                appConfiguerer.productRepository(),
                appConfiguerer.menu(),
                appConfiguerer.cart(),
                appConfiguerer.order()
        );
        orderApp.run();

    }
}




// 햄버거, 사이드, 음료 , 세트 판매
// 햄버거 : id, productName, price, Kcal   {단품/세트}
// 사이드 : id, productName, price, Kcal   {케쳡 개수}
// 음료 : id, productName, price, Kcal     {빨대 유무}

//상시 또는 불특정하게 할인 이벤트
