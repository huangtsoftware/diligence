package easy;

/**
 * Created on 2017/2/10.
 */
interface DefaultMethods {

    default String printString(String name) {
        return "hello " + name;
    }
}
