package builderxing.builder;

public class BuilderPatternDemo {
    public static void main(String args[]){
        //先生成创建类
        Builder builder = new ConcreteBuilder();
        //导演类，指导创建类去创建用户
        Director director = new Director(builder);
        //创建用户
        director.constructCharacter();
        //输出用户
        Character character = builder.getCharacter();
        character.showCharacter();
    }
}
