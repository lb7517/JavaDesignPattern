package jiegouxing.adapter.voltageconverter.objectadapter;

/**
 * @author : lb
 * @date : 2020/9/10 11:49
 * @description :
 */
public class PowerObjectAdapter implements DC5V {

    private AC220V ac220V;

    public PowerObjectAdapter(AC220V ac220V){
        this.ac220V = ac220V;
    }

    @Override
    public int output5v() {
        int output = this.ac220V.output220v();
        return output/22;
    }
}
