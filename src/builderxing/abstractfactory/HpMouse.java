package builderxing.abstractfactory;

import builderxing.abstractfactory.jiekou.Mouse;

public class HpMouse implements Mouse {
    @Override
    public void getMouse() {
        System.out.println("生产 HP 鼠标");
    }
}
