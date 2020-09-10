package jiegouxing.adapter.voltageconverter.interfaceadapter;

/**
 * @author : lb
 * @date : 2020/9/10 11:57
 * @description :
 */
public class PowerAdapter implements DCOutput {

    private AC220V ac220V;

    public PowerAdapter(AC220V ac220V){
        this.ac220V = ac220V;
    }

    @Override
    public int output5v() {
        int output = this.ac220V.output220V();
        return output/44;
    }

    @Override
    public int output10v() {
        int output = this.ac220V.output220V();
        return output/22;
    }

    @Override
    public int output22v() {
        int output = this.ac220V.output220V();
        return output/10;
    }

    @Override
    public int output1v() {
        int output = this.ac220V.output220V();
        return output/220;
    }
}
