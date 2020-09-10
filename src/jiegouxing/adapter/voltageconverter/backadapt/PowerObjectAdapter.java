package jiegouxing.adapter.voltageconverter.backadapt;

/**
 * 对象适配
 * */
public class PowerObjectAdapter implements DC5V{

    private AC220V ac220V;

    PowerObjectAdapter(AC220V ac220V){
        this.ac220V = ac220V;
    }

    @Override
    public int output5V() {
        int output = ac220V.output220V();
        return output/44;
    }
}
