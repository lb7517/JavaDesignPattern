package builderxing.factorypattern.abstractfactory.computer;

import builderxing.factorypattern.abstractfactory.computer.jiekou.Keybo;
import builderxing.factorypattern.abstractfactory.computer.jiekou.Mouse;

public abstract class PcFactory {
    abstract Mouse getMouse();  //生产鼠标
    abstract Keybo getKeybo();  //生产键盘
}
