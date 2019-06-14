package builderxing.single.lazy.unsafe;

public class SingletonPatternDemo {
    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();
        singleton.getMessage();
    }
}
