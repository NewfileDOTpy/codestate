package Products;

public class Tea extends Product{

    private boolean noTeabag;

    public Tea(int id, String name, int price, boolean noTeabag){
        super(id, name, price);
        this.noTeabag = noTeabag;
    }

}
