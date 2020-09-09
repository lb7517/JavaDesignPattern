package builderxing.factorypattern.car.interfacefactory;

/**
 * @author : lb
 * @date : 2020/9/4 16:15
 * @description :
 */
public class ToyotaTyre implements Tyre {
    @Override
    public void productType() {
        System.out.println("生产丰田轮胎");
    }
}
