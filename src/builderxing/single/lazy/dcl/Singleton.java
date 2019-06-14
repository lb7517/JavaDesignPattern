package builderxing.single.lazy.dcl;

//双检锁/双重校验锁
public class Singleton {
    private static Singleton instance;

    //在方法里面实现同步
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("lazy thread safe dcl single");
    }
}
