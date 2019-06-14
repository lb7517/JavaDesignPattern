package xingweixing.cardMediator;

public class PaterA extends AbstractCardPater {
    @Override
    public void ChangeMoney(int money, AbstractCardPater abstractCardPater,
                            AbstractMediator abstractMediator) {
        /*Money += money;
        other.Money -= money;*/

        abstractMediator.AWin(money, abstractCardPater);
    }
}
