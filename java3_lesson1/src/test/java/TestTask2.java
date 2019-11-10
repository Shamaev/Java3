import lesson6.Task2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask2 {
    private Task2 task2;
    @Before
    public void init () {
        task2 = new Task2();
    }

    @Test
    public void test1() {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {1,7};
        Assert.assertArrayEquals(arr2, task2.arrFour(arr));
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] arr2 = {3, 2, 1};
        Assert.assertArrayEquals(arr2, task2.arrFour(arr));
    }

    @Test
    public void test3() {
        int[] arr = {4, 4, 4, 4, 4, 4, 4, 4, 7};
        int[] arr2 = {7};
        Assert.assertArrayEquals(arr2, task2.arrFour(arr));
    }

    @Test
    public void test4() {
        int[] arr = {1, 2, 2, 3, 1, 7};
        int[] arr2 = {};
        Assert.assertArrayEquals(arr2, task2.arrFour(arr));
    }


}
