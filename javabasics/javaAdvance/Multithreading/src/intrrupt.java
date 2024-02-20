import java.util.TreeMap;

class exp implements  Runnable{
    public void run(){
        try{
            for (int i = 0; i < 2; i++) {
                System.out.println("focus");
                Thread.sleep(3000);
        }

        }catch(Exception e){
            System.out.println("thread is intrrupted");
        }
        
    }
}

public class intrrupt {
    public static void main(String[] args) {
        exp ex = new exp();
        Thread t = new Thread(ex);
        t.start();
        t.interrupt();//  no effect of intrrupt method as thread is not is waiting state
    }
}
