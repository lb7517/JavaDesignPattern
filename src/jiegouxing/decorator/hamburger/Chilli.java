package jiegouxing.decorator.hamburger;

/**
 * @author : lb
 * @date : 2021/4/19 15:55
 * @description :辣椒(装饰者的第二层)
 */
public class Chilli extends Condiment{

    Hamburger hamburger;

    Chilli(Hamburger hamburger){
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return this.hamburger.getName()+" 加辣椒";
    }

    @Override
    public double getPrice() {
        return hamburger.getPrice();   // 辣椒免费
    }
}
