package builderxing.factorypattern.car.interfacefactory;

/**
 * @author : lb
 * @date : 2020/9/4 16:16
 * @description : 汽车工厂
 */
public interface CarFactory {
    Tyre productTyre();
    Engine productEngine();
}
