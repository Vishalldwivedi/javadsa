import java.util.ArrayList;

public class gen1 {
    public static void main(String[] args) {
//        String[] st = new String[9];// no typesafety
//        st[0] = "vishal";
//        st[1] = "dwivedi";
//        st[2] = "vikas";
      //  st[3] = 10 ;
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("f");
        //ls.add(4);
        // when u r reteriving the data from collection u need to type caste from object to prefered
       // String zero = (String)ls.get(0);
        String zero = ls.get(0);
        //String first = (String)ls.get(1);//ClassCastException as it excepted for String type but get int
        // there for use this <> now it will get compiler time error not run time
        // now u have achived type safety using generics and no need to typecsastingno no down casting
    }
}
