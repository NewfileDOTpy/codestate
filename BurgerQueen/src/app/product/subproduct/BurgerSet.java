package app.product.subproduct;

import app.product.Product;

public class BurgerSet extends Product {

    private Hamburger hamburger;
    private Drink drink;
    private Side side;


    public BurgerSet( String name, int price, int kcal, Hamburger hamburger,  Side side, Drink drink) {
        super(name, price, kcal);
        this.hamburger = hamburger;
        this.drink = drink;
        this.side = side;
    }

    public BurgerSet(BurgerSet burgerSet){
        super(burgerSet.getName(), burgerSet.getPrice(), burgerSet.getKcal());
        this.hamburger = new Hamburger(burgerSet.hamburger);
        this.drink = new Drink(burgerSet.drink);
        this.side = new Side((burgerSet.side));
    }


    public Hamburger getHamburger() {
        return hamburger;
    }

    public Drink getDrink() {
        return drink;
    }

    public Side getSide() {
        return side;
    }
}
