package builderxing.factorypattern.car.abstractfactory;

public class HondaTyre implements Tyre {
    @Override
    public void productionTyre() {
        System.out.println("本田: 本田公司生产的轮胎");
    }
}
