package lesson6;

import org.apache.log4j.Logger;

public class Task1 {
    private static Server logic;

    public static void main(String[] args) {
        logic = new Server();
        logic.servDo(1,0);
    }
}

class Server {
    private static final Logger log = Logger.getLogger(Server.class);
    public void servDo(int a, int b){
        log.info("Пользователь ввел данные");
        int res = 0;
        try {
            res = a/b;
            
        } catch (ArithmeticException ae) {
            log.error("Error. b==0");
        }

        System.out.println(res);
    }

//    private void serverOut() {
//        System.out.println("Всё ок");
//        log.error("Error!");
//    }

}
