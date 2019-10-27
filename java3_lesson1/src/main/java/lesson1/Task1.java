package lesson1;

import java.util.Arrays;

public class Task1<T> {
    public T[] arr;
    public T a;
    public T b;

    public Task1(T[] arr) {
        this.arr = arr;
    }

    //    public Task1(T[] arr) {
//        this.arr = arr;
//    }
//
//    public T[] getArr() {
//        return arr;
//    }
//
//    public void setArr(T[] arr) {
//        this.arr = arr;
//    }

    public void swap (int x, int y) {

        if (x <= 0 || y <= 0 || x > arr.length || y > arr.length) {
            System.out.println("Вы вышли за пределы массива");

        } else {
            a = arr[x-1];
            b = arr[y-1];

            arr[x-1] = b;
            arr[y-1] = a;
        }



//        a = arr[0];
//        arr[0] = arr[1];
//        arr[1] = a;
    }

    public void print () {
        System.out.println(Arrays.toString(arr));
    }
}