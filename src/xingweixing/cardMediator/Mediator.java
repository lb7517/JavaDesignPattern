package xingweixing.cardMediator;

public class Mediator extends AbstractMediator{

    public Mediator(AbstractCardPater a, AbstractCardPater b, AbstractCardPater c){
        super(a, b, c);
    }

    @Override
    public void AWin(int money, AbstractCardPater abstractCardPater) {
        A.Money += money;
        int tmp = abstractCardPater.getMoney() - money;
        abstractCardPater.setMoney(tmp);
    }

    @Override
    public void BWin(int money, AbstractCardPater abstractCardPater) {
        B.Money += money;
        int tmp = abstractCardPater.getMoney() - money;
        abstractCardPater.setMoney(tmp);
    }

    @Override
    public void CWin(int money, AbstractCardPater abstractCardPater) {
        C.Money += money;
        int tmp = abstractCardPater.getMoney() - money;
        abstractCardPater.setMoney(tmp);
    }
}
