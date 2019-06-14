package jiegouxing.flyweight;

public class Circle implements Shape {

    private float x;

    private float y;

    private float radius;

    private String color;

    Circle(String color){
        this.color = color;
    }

    public void setX(float x){
        this.x = x;
    }

    public  void setY(float y){
        this.y = y;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw()[Color: "+color+", x: "+this.x+
                ", y: "+this.y+", radius: "+this.radius);
    }
}
