package builderxing.factorypattern.abstractfactory.computer;

import builderxing.factorypattern.abstractfactory.computer.jiekou.Keybo;
import builderxing.factorypattern.abstractfactory.computer.jiekou.Mouse;

public class FactoryPatternDemo {
    public static void main(String args[]){
        FactoryProducer fp = new FactoryProducer();

        //生产dell鼠标键盘
        PcFactory pcf1 = fp.createFactory("DellFactory");
        Mouse m1 = pcf1.getMouse();
        m1.getMouse();
        Keybo k1 = pcf1.getKeybo();
        k1.getKeybo();

        //生产hp鼠标键盘
        PcFactory pcf2 = fp.createFactory("HpFactory");
        Mouse m2 = pcf2.getMouse();
        m2.getMouse();
        Keybo k2 = pcf2.getKeybo();
        k2.getKeybo();
    }
}
