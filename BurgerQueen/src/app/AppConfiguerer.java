package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountConditon;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;
import app.product.ProductRepository;

public class AppConfiguerer {
    private Cart cart = new Cart(productRepository(), menu());




    public ProductRepository productRepository(){
        return new ProductRepository();
    }

    public Menu menu(){
        return new Menu(productRepository().getAllProduct());
    }

    public Cart cart(){
        return cart;
    }

    public Discount discount(){
        return new Discount(new DiscountConditon[]{
                new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
                new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
        });
    }
    public Order order(){
        return new Order(cart(), discount());
    }


}
