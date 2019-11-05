import lesson6.Task3;
import org.junit.Assert;
import org.junit.Test;

public class TestTask3 {

    @Test
    public void test1() {
        Task3 task3 = new Task3();
        int[] arr = {1,1,4};
        Assert.assertTrue(task3.oneAndFour(arr));
    }

    @Test
    public void test2() {
        Task3 task3 = new Task3();
        int[] arr = {1,1,4,1,1,4,4,4,4};
        Assert.assertTrue(task3.oneAndFour(arr));
    }

    @Test
    public void test3() {
        Task3 task3 = new Task3();
        int[] arr = {1,1,4,9};
        Assert.assertTrue(task3.oneAndFour(arr));
    }

}
