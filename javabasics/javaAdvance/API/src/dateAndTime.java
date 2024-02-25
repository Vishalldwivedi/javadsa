import java.util.ArrayList;
public class dateAndTime {
    public static void main(String[] args) {
        java.util.Date dt   = new java.util.Date();
        //java.util.ArrayList at = new java.util.ArrayList<>();
        // or import java.util.ArrayList
        System.out.println(dt);//Fri Feb 23 16:36:56 IST 2024

        long time = dt.getTime();
        java.sql.Date dtq = new java.sql.Date(time);// here we need to pass long in const
        System.out.println(dtq);// this is giving u only date not time
    }
}
