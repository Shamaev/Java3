package lesson1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    protected String type;
    protected float mass;

    public float getMass() {
        return mass;
    }
}

    class Apple extends Fruit {
        public Apple() {
            type = "APPLE";
            mass = 1.0f;
        }
    }


    class Orange extends Fruit {
        public Orange() {
            type = "ORANGE";
            mass = 1.5f;
        }
    }

    class Box<T extends Fruit> {
        ArrayList<T> arrayList = new ArrayList<>();
        public T object;

        public Box(T object) {
            this.object = object;
        }

        public void addBox (int num) {
            for (int i = 0; i < num; i++) {
                arrayList.add(object);
            }
        }

        public void info () {
            System.out.println(arrayList);
        }

        public float  getWeight() {
            float sum = 0;

            for (T o : arrayList) {
                sum += object.mass;
            }
            // Не получается записать сокращением - почему?
            // arrayList.forEach(item -> sum += object.mass);
//                float a = arrayList.size() * object.mass;
            return sum;
        }

        public boolean compare (Box<?> box2) {
            if (this.getWeight() == box2.getWeight() ) {
                return true;
            }
            return false;
        }

        public int num() {
            return arrayList.size();
        }

        public void inOut (Box<T> box2) {
                box2.addBox(this.num());
                arrayList.clear();
        }
    }
