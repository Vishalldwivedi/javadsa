import java.time.*;

public class JOdatime {
    public static void main(String[] args) {
// no constructor;
        // so invoke now() keyword return type is localDate which is static
        LocalDate d = LocalDate.now();
        System.out.println(d);
        int da = d.getDayOfMonth();
        System.out.println(da);
        int daa = d.getMonthValue();
        System.out.println(daa);
        int ddaa = d.getYear();
        System.out.println(ddaa);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        t.getHour();
        t.getMinute();
        t.getNano();


    }
}
