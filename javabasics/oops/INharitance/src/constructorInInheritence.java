
class demo1{
    int a, b;
    public demo1(){
        System.out.println("parent class constructor");
    }
    public  demo1(int x , int y){
        System.out.println("parametized parent class constructor");
        a  = x ;
        b = y ;
    }
}

class demo2 extends  demo1{
    int m , n ;
    public demo2(){
        // super() by default parent class constructor is called
        // this(12, 22) this method duty is to call the constructor of the same class not the parent class
        System.out.println("child class  onstructor");
    }
    public demo2(int x , int y ){
        //super() by default parent class constructor is called non pareametized will called
        //super(10, 33) this will call parametixzed const . of the parent const.

        System.out.println("parametirized parent class constructor");
        m = x ;
        n = y ;
    }
}
public class constructorInInheritence {
    public static void main(String[] args) {
        demo2 d = new demo2();// child class object
        //parent class constructor
        //child class  onstructor
        demo2 d2 = new demo2(10 , 209 );
        //parent class constructor
        //parametirized parent class constructor

    }
}
