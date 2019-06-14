package builderxing.builder;

public class Head implements PartOfRole {

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
