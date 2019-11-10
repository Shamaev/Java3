package lesson4;

public class Task1 {
    public static void main(String[] args) {
        Print print = new Print();
        PrintA printA = new PrintA(print);
        PrintB printB = new PrintB(print);
        PrintC printC = new PrintC(print);
        new Thread(printA).start();
        new Thread(printB).start();
        new Thread(printC).start();
    }
}

class Print {
    char ch = 'C';

    public synchronized void pullA () {
        while (ch == 'A' || ch == 'B') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ch = 'A';
        System.out.print(ch);
        notify();
    }

    public synchronized void pullB () {
        while (ch == 'B' || ch == 'C') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ch = 'B';
        System.out.print(ch);
        notify();
    }

    public synchronized void pullC () {
        while (ch == 'C' || ch == 'A') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ch = 'C';
        System.out.print(ch);
        notify();
    }


}

class PrintA implements Runnable {
    Print print;

    public PrintA(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            print.pullA();
        }
    }
}

class PrintB implements Runnable {
    Print print;

    public PrintB(Print print) {
        this.print = print;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            print.pullB();
        }
    }
}

class PrintC implements Runnable {
    Print print;

    public PrintC(Print print) {
        this.print = print;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            print.pullC();
        }
    }
}


