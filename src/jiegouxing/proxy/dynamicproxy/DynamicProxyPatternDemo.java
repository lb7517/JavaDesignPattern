package jiegouxing.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyPatternDemo {
    public static void main(String args[]){
        Financial financial = new Bank(true);
        FinancialManager financialManager = new FinancialManager(financial);

        // 方式一:
        Financial proxy = (Financial) Proxy.newProxyInstance(financial.getClass().getClassLoader(),
                financial.getClass().getInterfaces(), financialManager);

        // 方式二:
        /*Financial proxy = (Financial) Proxy.newProxyInstance(financial.getClass().getClassLoader(),
                new Class[]{Financial.class}, financialManager);*/

        // 方式三:
        /*Financial proxy = (Financial) Proxy.newProxyInstance(Financial.class.getClassLoader(),
                new Class[]{Financial.class}, financialManager);*/

        // 方式四:
        /*Financial proxy = (Financial) Proxy.newProxyInstance(Financial.class.getClassLoader(),
                financial.getClass().getInterfaces(), financialManager);*/
        proxy.profile();
    }
}
