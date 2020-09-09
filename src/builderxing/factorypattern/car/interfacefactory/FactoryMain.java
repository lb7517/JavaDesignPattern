package builderxing.factorypattern.car.interfacefactory;

/**
 * @author : lb
 * @date : 2020/9/4 16:26
 * @description :
 */
public class FactoryMain {
    public static void main(String[] args) throws Exception {
        CarFactory carFactory = FactoryProducer.productCar(ToyotaFactory.class);
        Engine engine = carFactory.productEngine();
        Tyre tyre = carFactory.productTyre();

        engine.productEngine();
        tyre.productType();
    }
}
