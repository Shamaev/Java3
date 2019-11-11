package lesson3;

import java.io.*;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args){
        File file1 = new File("src/main/java/lesson3/task2_1.txt");
        File file2 = new File("src/main/java/lesson3/task2_2.txt");
        File file3 = new File("src/main/java/lesson3/task2_3.txt");
        File file4 = new File("src/main/java/lesson3/task2_4.txt");
        File file5 = new File("src/main/java/lesson3/task2_5.txt");

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {
//
//            ArrayList<BufferedReader> listReader = new ArrayList<>();
//            listReader.add(new BufferedReader(new FileReader(file2)));
//            listReader.add(new BufferedReader(new FileReader(file3)));
//            listReader.add(new BufferedReader(new FileReader(file4)));
//            listReader.add(new BufferedReader(new FileReader(file5)));
//
//            for (BufferedReader o : listReader) {
//                String str;
//                while ((str = o.readLine()) != null) {
//                    bw.write(str + "\n");
//                }
//                o.close();
//            }
//
//            bw.flush();
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }






//        BufferedReader br2 = new BufferedReader(new FileReader(file2));
//        BufferedReader br3 = new BufferedReader(new FileReader(file3));
//        BufferedReader br4 = new BufferedReader(new FileReader(file4));
//        BufferedReader br5 = new BufferedReader(new FileReader(file5));

//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
//            BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true));
//            String str;
//            while ((str = br.readLine()) != null) {
//                bw.write(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {
//            bw.write("Hello + ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/lesson3/task2_2.txt"))) {
//            String str;
//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
