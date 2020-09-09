package builderxing.factorypattern.abstractfactory.computer;

import builderxing.factorypattern.abstractfactory.computer.jiekou.Keybo;

public class DellKeybo implements Keybo {
    @Override
    public void getKeybo() {
        System.out.println("生产dell键盘");
    }
}