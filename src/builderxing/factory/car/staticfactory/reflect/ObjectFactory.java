package builderxing.factory.car.staticfactory.reflect;

/**
 * @author : lb
 * @date : 2020/9/4 15:57
 * @description : 通过使用反射创建对象
 */
public class ObjectFactory {
    public static  <T> T productEngine(Class<T> clazz) throws Exception {
        T obj = null;
        obj = (T) Class.forName(clazz.getName()).newInstance();
//        obj = clazz.getDeclaredConstructor().newInstance();
        return obj;
    }
}
