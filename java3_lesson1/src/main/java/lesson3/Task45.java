package lesson3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Task45 {
    public static void main(String[] args) {
        Student student = new Student(1,"Bob1");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/lesson3/stud.st"));
            oos.writeObject(student);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//class Student implements Serializable {
//    int id;
//    String name;
//
//    public Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}


