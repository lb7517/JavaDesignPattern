package builder.basic;

//汉堡
public abstract class Burger implements Item {
    /*@Override
    public Packing packing(){
        return new Wapper();
    }*/

    @Override
    public abstract float price();
}
