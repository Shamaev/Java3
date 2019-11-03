package lesson4;



public class Task2 {
    public static void main(String[] args) {

//        Printer printer = new Printer();
//        Scanner scanner = new Scanner();

//        for (int i = 1; i < 5; i++) {
//            Thread t = new Thread(printer);
//            t.setName("Сотрудник " + i);
//            t.start();
//        }
//
//        for (int i = 6; i < 9; i++) {
//            Thread t = new Thread(scanner);
//            t.setName("Сотрудник " + i);
//            t.start();
//        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                Printer printer = new Printer();
                for (int i = 1; i < 5; i++) {
                    Thread t = new Thread(printer);
                    t.setName("Сотрудник " + i);
                    t.start();
                }
            }
        }).start();

        new Thread(new Runnable() {
            Scanner scanner = new Scanner();
            @Override
            public void run() {
                for (int i = 6; i < 9; i++) {
                    Thread t = new Thread(scanner);
                    t.setName("Сотрудник " + i);
                    t.start();
                }
            }
        }).start();
    }
}

class MFU {

    public synchronized void print() {
        System.out.println(Thread.currentThread().getName() + " начал печать");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName() + " закончил печать");
    }

    public synchronized void scan() {
        System.out.println(Thread.currentThread().getName() + " начал сканировать");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName() + " закончил сканировать");
    }
}

class Printer implements Runnable {

    MFU printer = new MFU();

    @Override
    public void run() {
        printer.print();
    }
}
class Scanner implements Runnable {

    MFU scanner = new MFU();

    @Override
    public void run() {
        scanner.scan();
    }
}
