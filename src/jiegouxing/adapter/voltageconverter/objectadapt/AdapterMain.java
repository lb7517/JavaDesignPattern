package jiegouxing.adapter.voltageconverter.objectadapt;

/**
 * @author : lb
 * @date : 2020/9/10 11:51
 * @description :
 */
public class AdapterMain {
    public static void main(String[] args){
        AC220V ac220V = new AC220V();
        PowerObjectAdapter powerClassAdapter = new PowerObjectAdapter(ac220V);
        int output = powerClassAdapter.output5v();
        System.out.println("适配结果电压: "+ output+"V");
        System.out.println("-------------------------------");
    }
}
