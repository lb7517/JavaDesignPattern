package builderxing.factory.car.abstractfactory2;

/**
 * @author : lb
 * @date : 2020/9/4 16:24
 * @description : 工厂生产者
 */
public class FactoryProducer {

    /**
     * 通过反射实例化对象
     * */
    public static <T> T productCar(Class<T> clazz) throws Exception {
        // 方式一：
//        return (T) Class.forName(clazz.getName()).newInstance();
        // 方式二:
        return clazz.getDeclaredConstructor().newInstance();
    }
}
