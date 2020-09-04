package builderxing.factory.car.staticfactory.reflect;

/**
 * @author : lb
 * @date : 2020/9/4 15:54
 * @description :
 */
public class Toyota implements Engine {
    @Override
    public void productEngine() {
        System.out.println("生产丰田发动机");
    }
}
