package builderxing.factory.car.abstractfactory2;

/**
 * @author : lb
 * @date : 2020/9/4 16:23
 * @description : 丰田工厂
 */
public class ToyotaFactory implements CarFactory {
    @Override
    public Tyre productTyre() {
        return new ToyotaTyre();
    }

    @Override
    public Engine productEngine() {
        return new ToyotaEngine();
    }
}
