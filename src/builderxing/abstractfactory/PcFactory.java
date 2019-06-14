package builderxing.abstractfactory;

import builderxing.abstractfactory.jiekou.Keybo;
import builderxing.abstractfactory.jiekou.Mouse;

public abstract class PcFactory {
    abstract Mouse getMouse();  //生产鼠标
    abstract Keybo getKeybo();  //生产键盘
}
