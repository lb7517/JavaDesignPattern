package jiegouxing.decorator;

public class DecoratorPatterDemo {
    public static void main(String args[]){
        Shape shape = new Circle();
        RedShapeDecorator decoratorPatterDemo = new RedShapeDecorator(shape);
        decoratorPatterDemo.draw();
    }
}
