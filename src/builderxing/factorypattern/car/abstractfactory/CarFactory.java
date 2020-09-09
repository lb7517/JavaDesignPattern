package builderxing.factorypattern.car.abstractfactory;

public abstract class CarFactory {
    abstract Tyre productionTyre();
    abstract Engine productionEngine();
}
