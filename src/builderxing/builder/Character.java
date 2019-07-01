package builderxing.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//人物负责组装部位
public class Character {

    private List<PartOfRole> list = new ArrayList<PartOfRole>();

    public void addPart(PartOfRole partOfRole){
        list.add(partOfRole);
    }

    public void showCharacter(){
        Iterator<PartOfRole> iterator = list.iterator();
        while (iterator.hasNext()){
            PartOfRole pof = iterator.next();
            System.out.println("部位名称: "+pof.getName());
        }
    }
}
