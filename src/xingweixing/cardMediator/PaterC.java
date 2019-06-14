package xingweixing.cardMediator;

public class PaterC extends AbstractCardPater {
    @Override
    public void ChangeMoney(int money, AbstractCardPater abstractCardParter,
                            AbstractMediator abstractMediator) {
        /*Money += money;
        other.Money -= money;*/

        abstractMediator.CWin(money, abstractCardParter);
    }
}
