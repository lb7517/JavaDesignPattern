package builderxing.single.meiju;

public enum Singleton {
    instance;
    public void getMessage(){
        System.out.println("enum thread safe single");
    }
}
