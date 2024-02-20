import java.util.Scanner;

class cc implements Runnable{
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
class mss implements Runnable{
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
public class createByImplemRunnableInterface {
    public static void main(String[] args) {

        cc c = new cc();
        mss m = new mss();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();



    }
}
