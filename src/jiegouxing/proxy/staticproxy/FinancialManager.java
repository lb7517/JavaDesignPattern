package jiegouxing.proxy.staticproxy;

public class FinancialManager implements Financial{

    private Bank bank;

    FinancialManager(){
    }

    @Override
    public void profile() {
        if(bank == null){
            bank = new Bank(true);
        }
        System.out.println("理财经理: 开始炒股");
        bank.profile();
    }
}
