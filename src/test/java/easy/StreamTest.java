package easy;

import org.junit.Test;

import java.util.concurrent.*;

/**
 *
 * java Stream类
 * Created on 2017/2/10.
 */
public class StreamTest {


    /**
     *
     * 多线程获取返回值
     */
    @Test
    public void test() throws ExecutionException, InterruptedException {
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(futureTask);
        int i = futureTask.get();
        System.out.println(i);
    }


}

/**
 * 执行具体的任务的类
 *
 *
 */
class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("call....");
        return 123;
    }
}