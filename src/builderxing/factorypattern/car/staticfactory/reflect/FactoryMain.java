package builderxing.factorypattern.car.staticfactory.reflect;

/**
 * @author : lb
 * @date : 2020/9/4 15:59
 * @description :
 */
public class FactoryMain {
    public static void main(String[] args) throws Exception {
        Engine engine = ObjectFactory.productEngine(Toyota.class);
        engine.productEngine();
    }
}
