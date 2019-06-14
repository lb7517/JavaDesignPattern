package builderxing.factory.car.abstractfactory;

public class FactoryProducer {
    public static CarFactory getFactory(String type){
        if("Honda".equals(type)){
            return new HondaFactory();
        }else if("Toyota".equals(type)){
            return new ToyotaFactory();
        }else{
            return null;
        }
    }
}
