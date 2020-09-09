package builderxing.factorypattern.car.abstractfactory;

public class ProxyPatternDemo {
    public static void main(String args[]){
//        String type = "Honda";
        String type = "Toyota";
        CarFactory carFactory = FactoryProducer.getFactory(type);
        Engine engine = carFactory.productionEngine();
        engine.productionEngine();

        Tyre tyre = carFactory.productionTyre();
        tyre.productionTyre();
    }
}
