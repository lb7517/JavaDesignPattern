package jiegouxing.adapter.voltageconverter;

import jiegouxing.adapter.voltageconverter.interfaceadapter.PowerAdapter;

public class AdapterPatternDemo {
    public static void main(String args[]){
        //方式一 类适配器
        PowerClassAdapter powerClassAdapter = new PowerClassAdapter();
        int output1 = powerClassAdapter.output5V();
        System.out.println("适配结果电压: "+ output1+"V");
        System.out.println("-------------------------------");

        //方式二 类适配器
        AC220V ac220V = new AC220V();
        PowerObjectAdapter powerObjectAdapter = new PowerObjectAdapter(ac220V);
        int output2 = powerObjectAdapter.output5V();
        System.out.println("适配结果电压: "+ output2+"V");
        System.out.println("---------------------------------");

        //方式三 接口适配器
        AC220V ac220V1 = new AC220V();
        PowerAdapter powerAdapter = new PowerAdapter(ac220V1);
        int output3 = powerAdapter.output10V();
        System.out.println("适配结果电压: "+ output3+"V");
    }
}
