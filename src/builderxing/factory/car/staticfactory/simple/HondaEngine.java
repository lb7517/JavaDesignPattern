package builderxing.factory.car.staticfactory.simple;

//本田
public class HondaEngine implements Engine {
    @Override
    public void productionEngine() {
        System.out.println("本田: 生产本田公司的发动机");
    }
}
