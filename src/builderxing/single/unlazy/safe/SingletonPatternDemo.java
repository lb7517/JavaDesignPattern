package builderxing.single.unlazy.safe;

public class SingletonPatternDemo {
    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();
        singleton.getMessage();
    }
}
