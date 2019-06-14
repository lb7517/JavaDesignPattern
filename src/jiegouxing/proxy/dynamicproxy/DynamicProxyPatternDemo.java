package jiegouxing.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyPatternDemo {
    public static void main(String args[]){
        Financial financial = new Bank(true);
        FinancialManager financialManager = new FinancialManager(financial);
        Financial proxy = (Financial) Proxy.newProxyInstance(financial.getClass().getClassLoader(),
                financial.getClass().getInterfaces(), financialManager);
        proxy.profile();
    }
}
