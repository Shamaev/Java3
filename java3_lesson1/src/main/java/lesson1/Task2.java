package lesson1;

import java.util.ArrayList;

public  class Task2<T> {
    ArrayList<T> al = new ArrayList<>();
    public T[] arr;
    public T o;

    public Task2(ArrayList<T> al, T[] arr) {
        this.al = al;
        this.arr = arr;
    }

    public ArrayList<T> transfer () {

        for (T o : arr) {
            al.add(o);
        }

         return al;

    }
}
