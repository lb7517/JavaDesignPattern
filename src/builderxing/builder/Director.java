package builderxing.builder;

//
public class Director {

    private Builder builder;

    Director(Builder builder){
        this.builder = builder;
    }

    public void constructCharacter(){
        builder.setHead();
        builder.setBody();
        builder.setFood();
    }
}
