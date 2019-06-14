package xingweixing.simpleCardMediator;

public abstract class AbstractCardParter {

    int Money;

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public abstract void ChangeMoney(int money, AbstractCardParter other);
}
