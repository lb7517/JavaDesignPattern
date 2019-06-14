package xingweixing.memento;

import java.util.ArrayList;
import java.util.List;

//相当于监视器
public class CareTaker {
    private List<Memento> list = new ArrayList<Memento>();

    public void add(Memento memento){
        list.add(memento);
    }

    public Memento getMemento(int index){
        return list.get(index);
    }
}
