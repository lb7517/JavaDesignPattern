package jiegouxing.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest {
    public static void main(String args[]){

        //方式一
        final BookFacadeImpl bfi = new BookFacadeImpl();
        BookFacadeCglib bfc = new BookFacadeCglib();
        BookFacadeImpl bfi1 = (BookFacadeImpl) bfc.getInstance(bfi);
        bfi1.addBook();


        //方式二
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(bfi.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects,
                                    MethodProxy methodProxy) throws Throwable {
                System.out.println("22预处理-----: "+method.getName());
                Object obj = methodProxy.invokeSuper(o, objects); //调用业务类（父类中）的方法
                System.out.println("22调用后操作-----");
                return obj;
            }
        });
        BookFacadeImpl bfi2 = (BookFacadeImpl) enhancer.create();
        bfi2.addBook();
    }
}
