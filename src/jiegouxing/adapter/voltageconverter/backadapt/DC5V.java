package jiegouxing.adapter.voltageconverter.backadapt;

/**
 * 直流5v
 * Destination：需要得到的类，Source通过适配得到的类对象，也就是我们期待得到的借口。
 * */
public interface DC5V {
    int output5V();
   /* public void output5V(){
        System.out.println("输出5V 的直流电");
    }*/
}
