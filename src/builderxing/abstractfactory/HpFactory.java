package builderxing.abstractfactory;

import builderxing.abstractfactory.jiekou.Keybo;
import builderxing.abstractfactory.jiekou.Mouse;

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
