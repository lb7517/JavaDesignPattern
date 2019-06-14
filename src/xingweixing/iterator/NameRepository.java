package xingweixing.iterator;

public class NameRepository implements Container {

    public String names[] = {"liu", "gao", "tang", "gong"};

    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}
