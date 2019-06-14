package builderxing.single.meiju;

public class SingletonPatternDemo {
    public static void main(String args[]){
        Singleton singleton = Singleton.instance;
        singleton.getMessage();
    }
}
