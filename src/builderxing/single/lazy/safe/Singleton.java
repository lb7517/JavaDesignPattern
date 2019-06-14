package builderxing.single.lazy.safe;

public class Singleton {
    public static Singleton instance;
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("lazy thread safe single");
    }
}
