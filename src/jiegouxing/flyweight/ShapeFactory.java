package jiegouxing.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> map = new HashMap<>();
    public static Shape getCircle(String color){
        Shape shape = map.get(color);
        if(shape == null){
            shape = new Circle(color);
            map.put(color, shape);
            System.out.println("Creating circle of color: "+color);
        }
        return shape;
    }
}
