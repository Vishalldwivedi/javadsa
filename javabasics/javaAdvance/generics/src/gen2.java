import java.util.ArrayList;

class student{
    private String name;
    private int id;
}
class emp{
    private String name;
    private int id;
}
public class gen2 {
    public static void main(String[] args) {
        student st = new student();

        student st2 = new student();

        emp e = new emp();

        ArrayList<student> a = new ArrayList<student>();
        a.add(st);
        a.add(st2);
        //a.add(e);// no error compilererror but run erro if no <> , type is diff so add<> to show compileerro

    }
}
