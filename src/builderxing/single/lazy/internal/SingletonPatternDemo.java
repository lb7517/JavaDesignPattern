package builderxing.single.lazy.internal;

public class SingletonPatternDemo {
    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();
        singleton.getMessage();
    }
}
