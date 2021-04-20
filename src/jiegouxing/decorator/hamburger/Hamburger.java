package jiegouxing.decorator.hamburger;

/**
 * @author : lb
 * @date : 2021/4/19 15:49
 * @description : 汉堡基类
 */
public abstract class Hamburger {

    protected String name;

    public String getName(){
        return name;
    }

    public abstract double getPrice();
}
