package lesson7;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task {


        public void start(Class a) {

            System.out.println(a.getSimpleName());

            Class c = Test1.class;

            Test1 test1 = new Test1();

            Method[] methods = c.getDeclaredMethods();

            for (Method m: methods) {
                if (m.isAnnotationPresent(MyTest.class)) {
                    try {
                        m.invoke(test1);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }



    public static void main(String[] args) {
        Task t = new Task();
        Class test1 = Test1.class;
        t.start(test1);


    }


}
