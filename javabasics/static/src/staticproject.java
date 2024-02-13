
 class demo1{
    static int a ;
    static int b ;
    int m ;// instance variable
    int n ;

    static{
        a = 10 ;
        b = 20;
        System.out.println("control in static block");
    }
    {// java intilization block
         m =100 ;
         n = 22;
        System.out.println("control on non static block");
    }

    static void display1(){
        System.out.println("value of static var " + a);
        System.out.println("value of static var" + b);
    }

     void display2(){
        System.out.println("value of instances var " + m);
        System.out.println("value of instance var" + n);
    }
}
public class staticproject {
    public static void main(String[] args) {
        demo1 d = new demo1();
        demo1.display1();
        d.display2();
    }// at last garbage collect will decallocate m and n value from heap as no one is referring to them
}
