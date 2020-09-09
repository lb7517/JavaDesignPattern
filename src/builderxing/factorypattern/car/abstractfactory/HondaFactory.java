package builderxing.factorypattern.car.abstractfactory;

public class HondaFactory extends CarFactory{

    @Override
    Tyre productionTyre() {
        return new HondaTyre();
    }

    @Override
    Engine productionEngine() {
        return new HondaEngine();
    }
}
