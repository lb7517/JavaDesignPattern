package builderxing.abstractfactory;

import builderxing.abstractfactory.jiekou.Keybo;
import builderxing.abstractfactory.jiekou.Mouse;

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
