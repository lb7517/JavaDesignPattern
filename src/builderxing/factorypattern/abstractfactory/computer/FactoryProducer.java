package builderxing.factorypattern.abstractfactory.computer;

public class FactoryProducer {
   PcFactory createFactory(String typeFactory){
       if(typeFactory == null){
           return null;
       }
       if(typeFactory.equals("DellFactory")){
           return  new DellFactory();
       }else if(typeFactory.equals("HpFactory")){
           return new HpFactory();
       }
       return null;
   }
}
