package lesson6;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1,1,4,0};
        System.out.println(oneAndFour(arr));
    }

    public static boolean oneAndFour (int[] arr) {
        boolean a = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                a = false;
            }
        }
        return a;
    }
}
