package jiegouxing.decorator;

public abstract class ShapeDecorator implements Shape{
    protected Shape shape;

    ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }
}
