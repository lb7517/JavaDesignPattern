package xingweixing.simpleCardMediator;

public class ParterA extends AbstractCardParter {
    @Override
    public void ChangeMoney(int money, AbstractCardParter other) {
        Money += money;
        other.Money -= money;
    }
}
