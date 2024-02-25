import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
//        List<Integer> ls = new ArrayList<>();
//        ls.add(1);
//        ls.add(2);
//        ls.add(3);ls.add(4);
//        ls.add(6);ls.add(5);ls.add(0);
//
//        System.out.println(ls);

        List<Integer> l2 = Arrays.asList(2,3,4,5,6,7,8,9);//array object collection
        // how to access these data; for loop or for each

//        for(Object o : l2){
//            System.out.println(o);
//        }
        l2.forEach(n-> System.out.println(n));// predefined inbuild function interface method with single abstract method

    }
}
