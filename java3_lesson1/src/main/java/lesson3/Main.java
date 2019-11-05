package lesson3;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
    }

    public static void method1 () {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(10);
        out.write(11);
        byte[] arr = out.toByteArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void method2() {


        byte[] outData = "Java".getBytes();

        for (int i = 0; i < outData.length; i++) {
            System.out.println(outData[i]);
        }
    }
}
