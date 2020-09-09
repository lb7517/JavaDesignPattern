package builderxing.factorypattern.car.interfacefactory;

/**
 * @author : lb
 * @date : 2020/9/4 16:23
 * @description :
 */
public class ToyotaEngine implements Engine {
    @Override
    public void productEngine() {
        System.out.println("生产丰田发动机");
    }
}
