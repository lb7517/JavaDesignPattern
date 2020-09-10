package jiegouxing.adapter.voltageconverter.classadapter;

/**
 * @author : lb
 * @date : 2020/9/10 11:49
 * @description :
 */
public class PowerClassAdapter extends AC220V implements DC5V {
    @Override
    public int output5v() {
        int output = output220v();
        return output/22;
    }
}
