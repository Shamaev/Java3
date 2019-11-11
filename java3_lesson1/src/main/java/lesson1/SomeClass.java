package lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomeClass {
    int id;
    String name;

    public SomeClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MainSomeClass {
    public static void main(String[] args) {
        List<SomeClass> lsc = new ArrayList<>();
        lsc.add(new SomeClass(1, "Test1"));
        lsc.add(new SomeClass(2, "Test1"));
        lsc.add(new SomeClass(3, "Test1"));
        lsc.add(new SomeClass(4, "Test2"));
        lsc.add(new SomeClass(5, "Test2"));
        lsc.add(new SomeClass(6, "Test3"));
        lsc.add(new SomeClass(7, "Test3"));
        lsc.add(new SomeClass(8, "Test4"));

        Map<String, ArrayList<Integer>> map = new HashMap<>();


        for (SomeClass someClass : lsc) {
            if (!map.containsKey(someClass.getName())) {
                ArrayList<Integer> arrI = new ArrayList<>();
                arrI.add(someClass.getId());
                map.put(someClass.getName(), arrI);
            } else {
                map.get(someClass.getName()).add(someClass.getId());
            }
        }

        System.out.println(map);

//        for (int i = 0; i < lsc.size(); i++) {
//            ArrayList<Integer> arrInt = new ArrayList<>();
//            for (int j = 0; j < lsc.size(); j++) {
//                if (lsc.get(i).getName().equals(lsc.get(j).getName())) {
//                    arrInt.add(lsc.get(j).getId());
//                }
//            }
//                map.put(lsc.get(i).getName(), arrInt);
//        }
//        System.out.println(map);


    }
}
