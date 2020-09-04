package builderxing.factory.car.abstractfactory2;

/**
 * @author : lb
 * @date : 2020/9/4 16:21
 * @description : 本田工厂
 */
public class HondaFactory implements CarFactory {
    @Override
    public Tyre productTyre() {
        return new HondaTyre();
    }

    @Override
    public Engine productEngine() {
        return new HondaEngine();
    }
}
