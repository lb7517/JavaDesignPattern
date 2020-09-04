package builderxing.factory.car.abstractfactory2;

/**
 * @author : lb
 * @date : 2020/9/4 16:22
 * @description :
 */
public class HondaEngine implements Engine {
    @Override
    public void productEngine() {
        System.out.println("生产本田发动机");
    }
}
