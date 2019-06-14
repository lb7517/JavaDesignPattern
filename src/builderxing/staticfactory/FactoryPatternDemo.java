package builderxing.staticfactory;

import builderxing.staticfactory.entity.Shape;

public class FactoryPatternDemo {
    public static void main(String args[]){
        //方式一 普通方式
        /*ShapeFactory sf = new ShapeFactory();
        //画圆操作
        Shape shape1 = sf.getShape("Circle");
        shape1.draw();

        //画长方形操作
        Shape shape2 = sf.getShape("Rectangle");
        shape2.draw();

        //画正方形操作
        Shape shape3 = sf.getShape("Square");
        shape3.draw();*/


        //方式二 静态方式
        //画圆操作
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        //画长方形操作
        Shape shape2 = ShapeFactory.getShape("Rectangle");
        shape2.draw();

        //画正方形操作
        Shape shape3 = ShapeFactory.getShape("Square");
        shape3.draw();
    }
}
