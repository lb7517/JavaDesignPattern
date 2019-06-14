package xingweixing.simpleCardMediator;

public class ParterB extends AbstractCardParter {
    @Override
    public void ChangeMoney(int money, AbstractCardParter other) {
        Money += money;
        other.Money -= money;
    }
}
