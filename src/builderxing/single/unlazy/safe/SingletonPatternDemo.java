package builderxing.single.unlazy.safe;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SingletonPatternDemo {

    private static Integer clientTotals = 200;
    private static AtomicInteger num = new AtomicInteger();

    public static void main(String args[]) throws InterruptedException {
        // 单例测试
//        Singleton.instance.getMessage();

        // 多线程测试单例
        testSafe();
    }

    /**
     * 多线程测试单例
     * */
    public static void testSafe() throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 16, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100000));
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(1);
        Executors.newSingleThreadExecutor();
        Executors.newWorkStealingPool();
        Executors.newScheduledThreadPool(1);
        /*ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3));*/
        CountDownLatch cd = new CountDownLatch(clientTotals);
        for(int i =0; i < clientTotals; i++){
            threadPoolExecutor.execute(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println("ThreadName: "+Thread.currentThread().getName()
                        + ", singleton: "+singleton);
                singleton.getMessage();
                cd.countDown();
            });
        }
        cd.await();
        System.out.println("主线程执行完毕");
    }
}
