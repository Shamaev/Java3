package lesson3;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/lesson3/task1.txt");
        file.createNewFile();

        OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file, true), "UTF8");
        write.write("text text2 text");
        write.flush();
        write.close();



        FileInputStream in = new FileInputStream("src/main/java/lesson3/task1.txt");
        InputStreamReader isr = new InputStreamReader(in, "UTF-8");
        int x;
        //      Я тут фишку заметил. Если через InputStreamReader делать, то arr чаровский.
        char[] arr = new char[512];
        while ((x = isr.read()) != -1) {
            System.out.println(new String(arr));
        }

        //     А если через FileInputStream делать, то arr байтовый.
//        byte[] arr = new byte[512];
//        while ((x = in.read(arr)) != -1) {
//            System.out.print(new String(arr));
//        }
        isr.close();

    }


}
