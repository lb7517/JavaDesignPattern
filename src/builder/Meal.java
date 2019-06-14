package builder;

import builder.basic.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Meal {
    private List<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()){
            cost = cost + (iterator.next()).price();
        }
        return cost;
    }

    public void showItems(){
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()){
            Item it = iterator.next();
            System.out.println("item: "+it.name());
//            System.out.println(", Packing: "+it.packing().pack());
            System.out.println(", Price: "+it.price());
        }
    }
}
