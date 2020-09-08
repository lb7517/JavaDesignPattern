package builderxing.single.lazy.unsafe;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class SingletonPatternDemo {

    private static AtomicInteger num = new AtomicInteger();

    // 请求总数
    public static int clientTotals = 200;

    public static void main(String args[]) throws InterruptedException {
        // 普通执行
//        Singleton.getInstance().getMessage();

        // 多线程环境
        testUnsafe();
    }

    /**
     *  通过线程池测试单例是否安全
     * */
    public static void testUnsafe() throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8,
                16, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100000));
        CountDownLatch cd = new CountDownLatch(clientTotals);
        for(int i =0; i < clientTotals; i++){
            threadPoolExecutor.execute(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println("ThreadName: "+Thread.currentThread().getName()
                        + ", singleton: "+singleton);
                singleton.getMessage();
                System.out.println(num.incrementAndGet());
                cd.countDown();
            });
        }
        cd.await();
        System.out.println("主线程执行完毕");
    }
}
