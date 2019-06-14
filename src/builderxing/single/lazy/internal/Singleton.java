package builderxing.single.lazy.internal;

public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void getMessage(){
        System.out.println("lazy thread safe internal class single");
    }
}
