package jiegouxing.adapter.voltageconverter.interfaceadapter;

/**
 * @author : lb
 * @date : 2020/9/10 11:56
 * @description : 直流电压总配置
 */
public interface DCOutput {
    int output5v();
    int output10v();
    int output22v();
    int output1v();
}
