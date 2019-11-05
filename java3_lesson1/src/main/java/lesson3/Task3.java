package lesson3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("src/main/java/lesson3/task3.txt", "UTF-8");

        nextLis( 5);
        nextLis2( 6); // второй способ


    }

    private  static void nextLis (int s) {
        try (FileInputStream in = new FileInputStream("src/main/java/lesson3/task3.txt")) {
            byte[] arr = new byte[1800];
            in.skip(1800*(s-1)); // принимаем, что нулевой страницы нет
                System.out.println(new String(arr,0, in.read(arr), "UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    private  static void nextLis2 (int s) {
        System.out.println();
        System.out.println("Способ 2");
        try (RandomAccessFile raf = new RandomAccessFile("src/main/java/lesson3/task3.txt", "r")) {
            raf.seek(1800*(s-1));
            byte[] arr = new byte[1800];
            System.out.println(new String(arr,0, raf.read(arr), "UTF-8"));
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private static String infoFile(File file) {
        return (int) file.length() +" b";
    }
}
