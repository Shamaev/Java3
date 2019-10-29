package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainLesson1 {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task1");

        Integer[] arri = {1,2,3,4};
        Task1<Integer> arrTask1 = new Task1<>(arri);
        arrTask1.print();
        arrTask1.swap(1,4); // Указываем какие именно элементы хотим поменять от 1 (первого). Типо пользователь не знает что мы считаем от 0
        arrTask1.print();

        String[] arrs = {"a","b","c","d"};
        Task1<String> arrsTask1 = new Task1<>(arrs);
        arrsTask1.print();
        arrsTask1.swap(1,4);
        arrsTask1.print();

        //Task2
        System.out.println();
        System.out.println("Task2");

        Integer[] alm = {1,2,3,4};
        ArrayList<Integer> al = new ArrayList<>();

        Task2<Integer> ari = new Task2<>(al, alm);

        ari.transfer();
        System.out.println(al);

        //Task3
        System.out.println();
        System.out.println("Task3");



        Orange orange = new Orange();


        Apple apple = new Apple();
        Box<Apple> boxApple = new Box<>(apple);


        Box<Orange> boxOrange = new Box<>(orange);

        boxApple.addBox(3);
        boxOrange.addBox(3);

        System.out.println("Коробка яблок весит: " + boxApple.getWeight());
        System.out.println("Коробка апельсинов весит: " + boxOrange.getWeight());

        System.out.println("Сравнение коробок: " + boxApple.compare(boxOrange));


        Box<Apple> boxApple2 = new Box<>(apple);
        boxApple2.addBox(4);
        boxApple.inOut(boxApple2);
        System.out.println("Коробка1 яблок весит: " + boxApple.getWeight());
        System.out.println("Коробка2 яблок весит: " + boxApple2.getWeight());




    }}
