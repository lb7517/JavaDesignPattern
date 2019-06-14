package xingweixing.iterator;

public class IteratorPatternDemo {
    public static void main(String args[]){
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println("name: "+iterator.next());
        }
    }
}
