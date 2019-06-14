package xingweixing.cardMediator;

public class PaterB extends AbstractCardPater {
    @Override
    public void ChangeMoney(int money, AbstractCardPater abstractCardParter,
                            AbstractMediator abstractMediator) {
        /*Money += money;
        other.Money -= money;*/
        abstractMediator.BWin(money, abstractCardParter);
    }
}
