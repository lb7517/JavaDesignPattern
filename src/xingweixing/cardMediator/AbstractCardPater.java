package xingweixing.cardMediator;

public abstract class AbstractCardPater {

    int Money;

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public abstract void ChangeMoney(int money, AbstractCardPater abstractCardPater,
                                     AbstractMediator abstractMediator);
}
