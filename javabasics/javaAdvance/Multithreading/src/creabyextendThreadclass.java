import java.util.Scanner;
class calc extends Thread{
    public void run(){
        System.out.println("task started");
        Scanner sc =  new Scanner(System.in);
        System.out.println("please enter the first no");
        int num1 = sc.nextInt();

        System.out.println("please enter the second no");
        int num2 = sc.nextInt();

        int res = num1 + num2;

        System.out.println(res);

        System.out.println("task ends");

    }
}
class mssg extends Thread{
    public void run(){
        System.out.println("********************");

        System.out.println("print * task");

        for(int i = 0 ; i < 10 ;i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.println("important tasks");
try{
    for(int i = 0 ;i< 3 ;i++){
        System.out.println("focus is important to master a skill");
        Thread.sleep(2000);// two seconds
    }
}catch(Exception e){
    System.out.println("some problem" + e);
}
    }
}
public class creabyextendThreadclass {
    public static void main(String[] args) {

        System.out.println("main thread started");
        calc t1 = new calc();// making thread objects
        mssg t2 = new mssg();
        t1.start();// registered to therad schedular i have make a new thread
        t2.start();
        //  all three threads r in thread schedular

    }
}
// here we have only one thread cpu is waiting for your input
// for every independent tasks within one application in need multiple threads
// that will make me to do task simultaneously without waiting for other task to end
