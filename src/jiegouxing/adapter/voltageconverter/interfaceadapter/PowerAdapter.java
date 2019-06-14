package jiegouxing.adapter.voltageconverter.interfaceadapter;

import jiegouxing.adapter.voltageconverter.AC220V;

public class PowerAdapter implements DCOutput {

    private AC220V ac220V;

    public PowerAdapter(AC220V ac220V){
       this.ac220V = ac220V;
    }

    @Override
    public int output5V() {
        return ac220V.output220V()/44;
    }

    @Override
    public int output10V() {
        return ac220V.output220V()/22;
    }

    @Override
    public int output22V() {
        return ac220V.output220V()/10;
    }
}
