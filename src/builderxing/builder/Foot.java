package builderxing.builder;

public class Foot implements PartOfRole {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String desc) {
        this.name = desc;
    }
}
