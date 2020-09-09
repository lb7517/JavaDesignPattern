package builderxing.factorypattern.abstractfactory.computer;

import builderxing.factorypattern.abstractfactory.computer.jiekou.Keybo;
import builderxing.factorypattern.abstractfactory.computer.jiekou.Mouse;

public class HpFactory extends PcFactory {
    @Override
    Mouse getMouse() {
        return new HpMouse();
    }

    @Override
    Keybo getKeybo() {
        return new HpKeybo();
    }
}
