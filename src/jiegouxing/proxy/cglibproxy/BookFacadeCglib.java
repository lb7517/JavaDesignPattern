package jiegouxing.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class BookFacadeCglib implements MethodInterceptor {

    private Object target; //业务类对象，供代理方法中进行真正的业务方法调用

    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();   //创建加强器，用来创建动态代理类
        enhancer.setSuperclass(this.target.getClass()); //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();
    }

    // 实现回调方法
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("11预处理-----");
        // 方式一:
        methodProxy.invokeSuper(o, objects);    // 被代理类子类对象，调用业务类（父类中即被代理类）的方法
        // 方式二:
//        method.invoke(this.target, objects);  // 被代理类调用业务类(即被代理类)的方法
        System.out.println("11调用后操作-----");
        return null;
    }
}
