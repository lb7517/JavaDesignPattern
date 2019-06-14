package xingweixing.iterator;

public class StringArrayIterator implements Iterator {

    String[] args;

    int index = 0;

    StringArrayIterator(String args[]){
        this.args = args;
    }

    @Override
    public boolean hasNext() {
        if(index < args.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(index < args.length){
            return args[index++];
        }
        return null;
    }
}
