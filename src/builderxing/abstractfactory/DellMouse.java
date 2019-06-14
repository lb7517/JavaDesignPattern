package builderxing.abstractfactory;

import builderxing.abstractfactory.jiekou.Mouse;

public class DellMouse implements Mouse {
    @Override
    public void getMouse() {
        System.out.println("生产dell鼠标");
    }
}
