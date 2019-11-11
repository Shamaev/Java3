package lesson8;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task1 {
 // Первый вариант, вроде работает. Просьба прислать еще варианты решений.
    private void forest1() {
        int [] arr = {1,2,3,2,3,2,2,1,1,1,1,2};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 1; i <= 20; i++) {
            hm.put(i,0);
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            hm.put(a, hm.get(a)+1);
        }

        for (Integer o: hm.keySet()){
            Integer key = o;
            Integer value = hm.get(o);
            System.out.println(key + " " + value);
        }
    }


    // Второй способ.. не получается(((
    private void forest2() throws IOException {
        ArrayList<Integer> al = new ArrayList<>();
        FileReader fr = new FileReader("src/main/java/lesson8/number.txt");
        BufferedReader reader = new BufferedReader(fr);
        int num;

        while ((num = reader.read()) != -1) {
            al.add(num);
        }
        reader.close();

        System.out.println(al);  // Вот тут отпечатывает коллекцию, как я понимаю в байтах...
        // Вопрос - как перевести в нужный вид. Потому что в итоге мы получаем не те числа...


        // Это я попробовал сам вычислить... Но мне кажется это ерунда какая то... У меня число 1 превратилось в число 49.
        // Соответственно нужно из каждого числа вычесть 48 и получится то, что нужно
        // Но как я понял, пробел = 32.. Поэтому пришлось сделать фильтр
        for (int i = 0; i < al.size(); i++) {
            al.set(i, al.get(i)-48);
        }

//        int[] arr = new int[al.size()];
//        for (int i = 0; i < al.size(); i++) {
//            arr[i] = al.get(i);
//        }

        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) < 0) {
                al.remove(i);
            }
        }

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) < 0) {
                al.remove(i);
            }
        }


        System.out.println(al);

        // Вот такой дибилизм я сделал.. Очень хочется, что бы вы мне прислали способ, как все эти числа считать с файла в лист нормально...



        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 1; i <= 20; i++) {
            hm.put(i,0);
        }

        for (int i = 0; i < al.size(); i++) {
            int a = al.get(i);
            hm.put(a, hm.get(a)+1);
        }

        for (Integer o: hm.keySet()){
            Integer key = o;
            Integer value = hm.get(o);
            System.out.println(key + " " + value);
        }

    }

    public static void main(String[] args) throws IOException {
        Task1 task1 = new Task1();
        task1.forest2();
    }
}
