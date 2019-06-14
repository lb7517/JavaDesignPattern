package jiegouxing.adapter.voltageconverter;

//Source：需要被适配的类、接口、对象，即Datas。
public class AC220V {
    public int output220V(){
        System.out.println("输出220V 的交流电");
        int output = 220;
        return output;
    }
}
