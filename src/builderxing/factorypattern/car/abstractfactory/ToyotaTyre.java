package builderxing.factorypattern.car.abstractfactory;

public class ToyotaTyre implements Tyre {
    @Override
    public void productionTyre() {
        System.out.println("丰田: 丰田公司生产的轮胎");
    }
}
