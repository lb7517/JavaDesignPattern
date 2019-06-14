package builderxing.abstractfactory;

import builderxing.abstractfactory.jiekou.Keybo;

public class HpKeybo implements Keybo {
    @Override
    public void getKeybo() {
        System.out.println("生产 HP 键盘");
    }
}
