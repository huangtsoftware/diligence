package threadpool;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * 多线程获取返回值
 * Created on 2017/2/15.
 */
public class ThreadTest {


    @Test
    public void test() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        System.out.println(Thread.currentThread().getName());
        FutureTask<String> task = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName());
                return "kk";
            }
        });

        FutureTask<String> task1 = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println(Thread.currentThread().getName());
                return "kk1";
            }
        });

        executorService.execute(task);
        executorService.execute(task1);

        String kk = task.get();
        String kk1 = task1.get();
        System.out.println(kk);
        System.out.println(kk1);
    }

}
