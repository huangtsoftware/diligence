package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created on 2017/2/9.
 */
public class EasyTest {

    /**
     * 新特性
     * lambdas表达式和Function接口
     * 接口的默认和静态方法
     *
     */
    @Test
    public void test() {
        Arrays.asList("a", "b").forEach((String e) -> System.out.println(e));
        Arrays.asList("a", "d").forEach(e -> {
            System.out.println(e + 1);
            System.out.println(e);
        });
        Arrays.asList("c", "d").forEach(new Consumer(){
            @Override
            public void accept(Object o) {
                System.out.println("accept:" + o);
            }

            @Override
            public Consumer andThen(Consumer after) {
                System.out.println("andThen:" + after);
                return null;
            }
        });
    }
}
