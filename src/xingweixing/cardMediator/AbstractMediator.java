package xingweixing.cardMediator;

public abstract class AbstractMediator {

    protected AbstractCardPater A;

    protected AbstractCardPater B;

    protected AbstractCardPater C;

    public AbstractMediator(AbstractCardPater a, AbstractCardPater b, AbstractCardPater c){
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public abstract void AWin(int money, AbstractCardPater abstractCardPater);
    public abstract void BWin(int money, AbstractCardPater abstractCardPater);
    public abstract void CWin(int money, AbstractCardPater abstractCardPater);
}
