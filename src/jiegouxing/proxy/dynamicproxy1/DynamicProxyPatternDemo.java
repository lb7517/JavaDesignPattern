package jiegouxing.proxy.dynamicproxy1;

public class DynamicProxyPatternDemo {
    public static void main(String args[]){
        Financial financial = new Bank(true);
        FinancialManager financialManager = new FinancialManager(financial);
        //生成代理对象
        Financial proxy = (Financial) financialManager.getInstance();
        proxy.profile();
    }
}
