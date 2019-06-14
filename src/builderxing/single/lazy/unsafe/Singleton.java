package builderxing.single.lazy.unsafe;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("lazy thread unsafe single");
    }
}
