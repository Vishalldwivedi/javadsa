import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class student{
    private String name;
    private int age;
    private String city;
    public student(String name, int age, String city){
        this.name = name ;
        this.age = age;
        this.city = city ;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }
     //over riding to ssting method of Object parent class
    // as if not over ride it will return the address of the object
    // if we overrider the tostirng method of object parent calss
    // it will show use the normal data of the object not the address
    public String toString(){
        return name + " " + age + " " + city;
    }
 }
public class map3 {
    public static void main(String[] args) {
        student s1 = new student("vishal", 4,"roorkee");
        student s2 = new student("rohit", 43,"delhi");
        student s3 = new student("rom", 12,"pak");
        Map map = new HashMap();
        map.put(1,s1);// address of the objecct
        map.put(2,s2);
        map.put(3,s3);
        System.out.println(map);// it is internally calling toString method

        // to access keys and value
        Set st  = map.entrySet();
        Iterator itr = st.iterator();
        while(itr.hasNext()){
            Map.Entry data = (Map.Entry)itr.next();
            System.out.println(data.getKey() + " " + data.getValue());
        }

    }
}
