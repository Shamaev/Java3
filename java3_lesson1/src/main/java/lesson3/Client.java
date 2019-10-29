package lesson3;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8189);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            Student student = new Student(1,"Bob1");
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/lesson3/stud.st"));
                oos.writeObject(student);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (BufferedReader wr = new BufferedReader(new FileReader("src/main/java/lesson3/stud.st"))) {
                String str;
//                while ((str = wr. != null) {
//                    dos.writeUTF(str);
//                }
            } catch (IOException e) {
                e.printStackTrace();
            }



            dos.writeUTF(new String());
        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}

class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
