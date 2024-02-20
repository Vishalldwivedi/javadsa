
class demo implements Runnable{
    public void run(){
        try{
            for(int i = 0;i< 2 ;i++){
                System.out.println("focus is important");
                Thread.sleep(3000);
            }
        }catch (Exception e){
            System.out.println("some problem" + e);
        }
    }
}
public class joinIsAlivemethods {
    public static void main(String[] args)throws Exception {
        System.out.println("main thread");
        demo d  = new demo();
        Thread t = new Thread(d);
        System.out.println(t.isAlive());//false as is not started yet
        t.start();
        System.out.println(t.isAlive());// true
        t.join();// first t will finish the work completely than main thread will execute

        System.out.println("main thread finished the work");// first main thread will finish the work
        // than outher


    }
}
