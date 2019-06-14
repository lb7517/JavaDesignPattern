package jiegouxing.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        shape.draw();
        setRedBorder(shape);
    }

    public void setRedBorder(Shape decoratorShape){
        System.out.println("Border color: Red");
    }
}
