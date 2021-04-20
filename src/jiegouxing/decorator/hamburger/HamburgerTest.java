package jiegouxing.decorator.hamburger;

/**
 * @author : lb
 * @date : 2021/4/19 15:57
 * @description :
 */
public class HamburgerTest {
    public static void main(String...args){
        Hamburger hamburger = new ChickenBurger();
        System.out.println(hamburger.getName()+" 价钱:"+hamburger.getPrice());
        Lettuce lettuce = new Lettuce(hamburger);
        System.out.println(lettuce.getName()+" 价钱:"+lettuce.getPrice());
        Chilli chilli = new Chilli(hamburger);
        System.out.println(chilli.getName()+" 价钱:"+chilli.getPrice());
        // 注意使用生菜装者对象做参数
        Chilli chilli1 = new Chilli(lettuce);
        System.out.println(chilli1.getName()+" 价钱:"+chilli1.getPrice());
    }
}
