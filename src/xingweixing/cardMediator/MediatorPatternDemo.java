package xingweixing.cardMediator;

public class MediatorPatternDemo {
    public static void main(String args[]){
        AbstractCardPater A = new PaterA();
        AbstractCardPater B = new PaterB();
        AbstractCardPater C = new PaterC();
        A.Money = 20;
        B.Money = 20;
        C.Money = 20;
        AbstractMediator mediator = new Mediator(A, B, C);

        //A赢了
        A.ChangeMoney(5, B, mediator);
        System.out.println("A现在的钱是: "+A.Money);
        System.out.println("B现在的钱是: "+B.Money);
        System.out.println("------------------------");

        //A赢了C
        A.ChangeMoney(5, C, mediator);
        System.out.println("A现在的钱是: "+A.Money);
        System.out.println("C现在的钱是: "+C.Money);
        System.out.println("------------------------");
    }
}
