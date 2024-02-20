

// inncer class types :
// member inner class means non static b ,  static inner is static b and anonimous ;
// we can write  class static when it is a inner class;
class A{// has two members
    public void show (){
        System.out.println("in show");
    }
     class B{
        public void display(){
            System.out.println("in display");
        }
    }
}
public class inner {
    public static void main(String[] args) {
        A obj = new A();
        // to use the display method  we first need to create the object of b also
        // also we need to use the A reference and  a obj as B is a member of a so to use B we need a

        A.B o = obj.new B();
        obj.show();
        o.display();

    }
}

// if inner class is static then we need the  A.B o  = new A.B();
// but if the inner class is non static then we need the A's object  A.B o = obj.new B();
