package builderxing.factorypattern.car.abstractfactory;

//丰田
public class ToyotaEngine implements Engine {

    @Override
    public void productionEngine() {
        System.out.println("丰田: 生产丰田发动机");
    }
}
