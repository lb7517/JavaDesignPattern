package builderxing.factorypattern.car.staticfactory.simple;

public class EngineFactory {

    public static Engine getInstance(String type){
        if("Honda".equals(type)){
            return new HondaEngine();
        }else if("ToyotaEngine".equals(type)){
            return new Toyota();
        }else {
            return null;
        }
    }

}
