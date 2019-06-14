package jiegouxing.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FinancialManager implements InvocationHandler {
    private Financial financial;

    FinancialManager(Financial financial){
        this.financial = financial;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if(!method.getName().equals("profile")){
            return "没有profile方法";
        }
        Object result = method.invoke(this.financial, args);
        System.out.println("调用赚钱的方法");
        return result;
    }
}
