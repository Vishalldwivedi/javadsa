import java.util.HashMap;

class Employes{
    private String name;
    private int empId;

    public Employes(String name, int eid){// secilised setter is constructor
        this.name = name;
        this.empId = eid;
    }
    public String toString(){
        return  empId + " ";
    }
    @Override
    public void finalize(){
        System.out.println("clean up work by gc before deallocating memory from heap");
    }
}
public class map5 {
    public static void main(String[] args) {
        Employes e = new Employes("vishal" , 145);

        HashMap hm = new HashMap();
        hm.put(e,"vishal");
        System.out.println(hm);
        //hashmap dominates gc as gc is not able to clean object from heap as e  = null
        // there for we use WeakHashMap so that gc can deallocate the memory



        e = null;//eligible for garbage collection
        System.gc();//invoking garbage collector
        //internally gc calles finilized  method prsent in object class
        // it has many method one of is finilized method in object class
        // which help gc for object clean up
        // if no parent then behind the seen a class extends Object class
        // gc internally takes help of finilize method for object clean up
        System.out.println("last line");



    }
}
