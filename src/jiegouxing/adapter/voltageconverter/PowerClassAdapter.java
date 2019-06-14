package jiegouxing.adapter.voltageconverter;

//类适配
public class PowerClassAdapter extends AC220V implements DC5V{
    @Override
    public int output5V() {
        int output = output220V();
        return output/44;
    }
}
