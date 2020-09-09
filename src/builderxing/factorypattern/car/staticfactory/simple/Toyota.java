package builderxing.factorypattern.car.staticfactory.simple;

//丰田
public class Toyota implements Engine{

    @Override
    public void productionEngine() {
        System.out.println("丰田: 生产丰田发动机");
    }
}
