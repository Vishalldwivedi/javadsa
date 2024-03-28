import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// extra information of the code
import java.lang.annotation.*;
import java.lang.reflect.AnnotatedArrayType;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface cricketPlayer{// this is a annotation , we need to specify the target ogg this anno
 String country();
 //or  String country() default "india";
    int age() default 34;
}

@cricketPlayer(country =  "india",age = 66)
class virat{
    private int innings;
    private int runs;

    public int getInning(){
        return innings;
    }
    public void setInnings(int innings){
        this.innings = innings;
    }
    public int getRuns(){
        return runs;
    }
    public void setRuns(int runs){
        this.runs = runs;
    }

}


public class customAnnotaion {
    public static void main(String[] args) {
        virat v = new virat();
        v.setInnings(44);
        v.getInning();
        v.setRuns(44444);
        v.getRuns();
        Class c = v.getClass();
        Annotation s = c.getAnnotation(cricketPlayer.class);
        cricketPlayer cp = (cricketPlayer)s;// down caste to child class
        String cc = cp.country();
        System.out.println(cc);
        int age = cp.age();
        System.out.println(age);
    }
}
