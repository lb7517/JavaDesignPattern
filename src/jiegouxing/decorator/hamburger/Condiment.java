package jiegouxing.decorator.hamburger;

/**
 * @author : lb
 * @date : 2021/4/19 15:52
 * @description : 配料的基类(装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料)
 */
public abstract class Condiment extends Hamburger {

    public abstract String getName();

}
