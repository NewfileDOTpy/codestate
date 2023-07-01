package Products;

public class Coffee extends Product{

    private boolean extraShot;

    public Coffee(int id, String name, int price, boolean extraShot){
        super(id, name, price);
        this.extraShot = extraShot;

    }
}
