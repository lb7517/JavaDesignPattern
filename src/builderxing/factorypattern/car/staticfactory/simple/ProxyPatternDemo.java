package builderxing.factorypattern.car.staticfactory.simple;

public class ProxyPatternDemo {
    public static void main(String args[]){
//        String type = "Honda";
        String type = "ToyotaEngine";
        Engine engine = EngineFactory.getInstance(type);
        engine.productionEngine();
    }
}
