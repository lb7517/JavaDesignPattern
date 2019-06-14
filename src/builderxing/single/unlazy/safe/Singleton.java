package builderxing.single.unlazy.safe;

public class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    public void getMessage(){
        System.out.println("unlazy thread unsafe single");
    }
}
