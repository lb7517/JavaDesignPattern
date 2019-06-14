package jiegouxing.proxy.dynamicproxy1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class FinancialManager {

    private Financial financial;

    FinancialManager(Financial financial){
        this.financial = financial;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(financial.getClass().getClassLoader(),
                financial.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("调用代理类");
                        Object result = method.invoke(financial, args);
                        System.out.println("调用赚钱的方法");
                        return null;
                    }
                });
    }
}
