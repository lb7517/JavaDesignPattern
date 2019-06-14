package builderxing.builder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConcreteBuilder implements Builder {

    private Character character = new Character();

    private Properties role_pro = new Properties();

    ConcreteBuilder(){
        try {
            role_pro.load(new FileInputStream("src/builderxing/builder/part.properties"));
        } catch (IOException e) {
            System.out.println("属性值不存在");
            e.printStackTrace();
        }
    }

    @Override
    public void setHead() {
        PartOfRole partOfRole = new Head();
        partOfRole.setName(role_pro.getProperty("role_head"));
        character.addPart(partOfRole);
    }

    @Override
    public void setBody() {
        PartOfRole partOfRole = new Body();
        partOfRole.setName(role_pro.getProperty("role_body"));
        character.addPart(partOfRole);
    }

    @Override
    public void setFood() {
        PartOfRole partOfRole = new Foot();
        partOfRole.setName(role_pro.getProperty("role_foot"));
        character.addPart(partOfRole);
    }

    @Override
    public Character getCharacter() {
        return character;
    }
}
