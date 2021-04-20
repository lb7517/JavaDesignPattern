package jiegouxing.decorator.hamburger;

/**
 * @author : lb
 * @date : 2021/4/19 15:53
 * @description : 生菜(装饰者的第一层)
 */
public class Lettuce extends Condiment {

    Hamburger hamburger;

    public Lettuce(Hamburger hamburger){
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName()+" 加生菜";
    }

    @Override
    public double getPrice() {
        return hamburger.getPrice()+1.5;
    }
}
