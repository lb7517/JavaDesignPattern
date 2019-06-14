package builderxing.staticfactory;

import builderxing.staticfactory.entity.Circle;
import builderxing.staticfactory.entity.Rectangle;
import builderxing.staticfactory.entity.Shape;
import builderxing.staticfactory.entity.Square;

public class ShapeFactory {

    //方式一 普通工厂方法
    /*public Shape getShape(String typeShape){
        if(typeShape == null){
            return null;
        }
        //equalsIgnoreCase不区分大小写，equals
        if(typeShape.equals("Circle")){
            return new Circle();
        }else if(typeShape.equals("Rectangle")){
            return new Rectangle();
        }else if(typeShape.equals("Square")){
            return new Square();
        }
        return null;
    }*/


    //方式二 静态工厂方法，避免new
    public static Shape getShape(String typeShape){
        if(typeShape == null){
            return null;
        }
        //equalsIgnoreCase不区分大小写，equals
        if(typeShape.equals("Circle")){
            return new Circle();
        }else if(typeShape.equals("Rectangle")){
            return new Rectangle();
        }else if(typeShape.equals("Square")){
            return new Square();
        }
        return null;
    }
}
