package builderxing.factorypattern.abstractfactory.computer;

import builderxing.factorypattern.abstractfactory.computer.jiekou.Keybo;

public class HpKeybo implements Keybo {
    @Override
    public void getKeybo() {
        System.out.println("生产 HP 键盘");
    }
}
