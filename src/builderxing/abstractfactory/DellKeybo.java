package builderxing.abstractfactory;

import builderxing.abstractfactory.jiekou.Keybo;

public class DellKeybo implements Keybo {
    @Override
    public void getKeybo() {
        System.out.println("生产dell键盘");
    }
}