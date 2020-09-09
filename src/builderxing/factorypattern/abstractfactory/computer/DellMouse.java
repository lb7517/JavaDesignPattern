package builderxing.factorypattern.abstractfactory.computer;

import builderxing.factorypattern.abstractfactory.computer.jiekou.Mouse;

public class DellMouse implements Mouse {
    @Override
    public void getMouse() {
        System.out.println("生产dell鼠标");
    }
}
