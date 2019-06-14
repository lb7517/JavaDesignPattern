package jiegouxing.flyweight;

public class FlyweightPatternDemo {
    private static final String color[] = {"red", "green", "blue", "black"};
    public static void main(String args[]){
        for(int i =0; i < 20; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getX());
            circle.setY(getY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        double pos = Math.random()*color.length;
        return color[(int)pos];
    }

    private static float getX(){
        return (float) Math.random()*100;
    }

    private static float getY(){
        return (float) Math.random()*100;
    }


}
