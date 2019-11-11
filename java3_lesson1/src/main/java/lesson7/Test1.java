package lesson7;

import java.lang.reflect.Method;

public class Test1 {
    private Task task2;

    @MyTest
    public void test1() {
        System.out.println("TEST_1, test1");
    }

    public void test2() {
        System.out.println("TEST_1, test2");
    }

    @MyTest
    public void test3() {
        System.out.println("TEST_1, test3");
    }
}
