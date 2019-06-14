package xingweixing.simpleCardMediator;

public class SimpleDemo {
    public static void main(String args[]){
        AbstractCardParter A = new ParterA();
        A.Money = 20;

        AbstractCardParter B = new ParterB();
        B.Money = 20;

        AbstractCardParter C = new ParterC();
        C.Money = 20;

        //A赢了B的钱
        A.ChangeMoney(5, B);
        System.out.println("A现在的钱是: "+A.Money);
        System.out.println("B现在的钱是: "+B.Money);
        System.out.println("--------------------------");

        //A赢了C的钱
        A.ChangeMoney(5, C);
        System.out.println("A现在的钱是: "+A.Money);
        System.out.println("C现在的钱是: "+C.Money);
        System.out.println("--------------------------");

        //B赢了C的钱
        B.ChangeMoney(5, C);
        System.out.println("B现在的钱是: "+B.Money);
        System.out.println("C现在的钱是: "+C.Money);
    }
}
