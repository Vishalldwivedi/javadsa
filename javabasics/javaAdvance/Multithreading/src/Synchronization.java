import java.util.TreeMap;

class car implements Runnable{
    synchronized public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " got into car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " started to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()  + "came back and park the car");
//        synchronized (this) {
//            System.out.println(Thread.currentThread().getName() + " got into car to drive");
//            Thread.sleep(2000);
//            System.out.println(Thread.currentThread().getName() + " started to drive");
//            Thread.sleep(2000);
//            System.out.println(Thread.currentThread().getName() + "came back and park the car");
//        } // i can make some part synchronized not all using a block
        }catch (Exception e){
            System.out.println("some problem");
        }
    }
}
public class Synchronization {
    public static void main(String[] args) {
        car c = new car();
        Thread t  = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t.setName("son1");
        t2.setName("son2");
        t3.setName("son3");
        t.start();
        t2.start();
        t3.start();// this is a race problem they r wasting the cpu time and not utilizing resources
        // running for the same resources
        // here resource is run () and there r multiple threads
        // we can apply syncroized keyword to the method or a block
        
        // via syncronized keyword when sleepis called then also thread schedular will exucute the same thread
        // so in a synchronized envorinment single therad is executed at a time

    }
}
