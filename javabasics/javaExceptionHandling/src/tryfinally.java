import java.util.InputMismatchException;
import java.util.Scanner;

public class tryfinally {
    public static void main(String[] args) {
        int num = 0 ;
        Scanner sc = new Scanner(System.in);

        try {// try block will fully execute when no exception
            num = sc.nextInt();
        }
        catch(InputMismatchException obj) {// when there i a exception
            System.out.println("please enter a no ");
        }// we can use try without catch

        finally{// irrrespective of if there is a exception or not
            // if a open a scanner object then close it
            // database connection if open then  close  it
            // file open then close it
            sc.close();// resource should close
        }

        System.out.println(num);
    }
}
