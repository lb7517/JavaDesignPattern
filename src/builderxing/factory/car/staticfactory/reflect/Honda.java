package builderxing.factory.car.staticfactory.reflect;

/**
 * @author : lb
 * @date : 2020/9/4 15:56
 * @description :
 */
public class Honda implements Engine {
    @Override
    public void productEngine() {
        System.out.println("生产本田发动机");
    }
}
