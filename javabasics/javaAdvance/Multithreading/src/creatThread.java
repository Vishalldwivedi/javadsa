
 class myThread extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}
public class creatThread {

    public static void main(String[] args) {
        System.out.println("main thread");
        myThread my = new myThread();
        my.start();// no need to call run method // give to thread schedular
    }
}
