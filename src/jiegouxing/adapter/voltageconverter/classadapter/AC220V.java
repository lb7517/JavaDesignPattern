package jiegouxing.adapter.voltageconverter.classadapter;

/**
 * @author : lb
 * @date : 2020/9/10 11:46
 * @description : 交流220v电压
 */
public class AC220V {

    public int output220v() {
        int output = 220;
        System.out.println("输出" + output + "V的交流电");
        return output;
    }

}
