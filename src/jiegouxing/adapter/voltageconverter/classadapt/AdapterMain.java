package jiegouxing.adapter.voltageconverter.classadapt;

/**
 * @author : lb
 * @date : 2020/9/10 11:51
 * @description :
 */
public class AdapterMain {
    public static void main(String[] args){
        PowerClassAdapter powerClassAdapter = new PowerClassAdapter();
        int output = powerClassAdapter.output5v();
        System.out.println("适配结果电压: "+ output+"V");
        System.out.println("-------------------------------");
    }
}
