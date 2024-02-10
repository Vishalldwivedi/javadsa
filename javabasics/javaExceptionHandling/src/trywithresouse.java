import java.util.Scanner;

public class trywithresouse {

    public static void main(String[] args) {
        int num = 0 ;



        try( Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }
        System.out.println(num);
    }
}
