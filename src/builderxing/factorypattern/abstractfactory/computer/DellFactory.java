package builderxing.factorypattern.abstractfactory.computer;

import builderxing.factorypattern.abstractfactory.computer.jiekou.Keybo;
import builderxing.factorypattern.abstractfactory.computer.jiekou.Mouse;

public class DellFactory extends PcFactory {
    @Override
    Mouse getMouse() {
        return new DellMouse();
    }

    @Override
    Keybo getKeybo() {
        return new DellKeybo();
    }
}
