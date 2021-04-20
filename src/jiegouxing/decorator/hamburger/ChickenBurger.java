package jiegouxing.decorator.hamburger;

/**
 * @author : lb
 * @date : 2021/4/19 15:50
 * @description : 鸡腿堡(被装饰者的初始状态，有些自己的简单装饰)
 */
public class ChickenBurger extends Hamburger {

    public ChickenBurger(){
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
