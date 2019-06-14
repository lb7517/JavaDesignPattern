package builderxing.factory.car.abstractfactory;

public class ToyotaFactory extends CarFactory {
    @Override
    Tyre productionTyre() {
        return new ToyotaTyre();
    }

    @Override
    Engine productionEngine() {
        return new ToyotaEngine();
    }
}
