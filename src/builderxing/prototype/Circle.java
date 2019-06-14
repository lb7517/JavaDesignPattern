package builderxing.prototype;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("画圆操作");
    }
}
