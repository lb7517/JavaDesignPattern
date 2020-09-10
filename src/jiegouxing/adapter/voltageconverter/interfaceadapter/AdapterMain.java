package jiegouxing.adapter.voltageconverter.interfaceadapter;

/**
 * @author : lb
 * @date : 2020/9/10 11:58
 * @description :
 */
public class AdapterMain {
    public static void main(String[] args){
        AC220V ac220V = new AC220V();
        PowerAdapter powerAdapter = new PowerAdapter(ac220V);
        int output = powerAdapter.output1v();
        System.out.println("适配结果电压: "+ output+"V");
    }
}
