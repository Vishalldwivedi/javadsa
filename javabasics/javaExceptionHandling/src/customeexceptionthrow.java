
class myException extends Exception{
          myException()    {}
            myException(String s)   {
                        // this it self will not print mssg
                super(s)       ;//using super keyword child class can call parent
                // class constructor
           }
   }
public class customeexceptionthrow {
    public static void main(String[] args) {
        int n = 8 ;
        int nn = -4  ;

        try {
            if (nn < 0) {
              // Exception e = new ArithmeticException("negativeno");
                Exception e = new myException("negative no ")        ;
               throw e ; 
            } else {
                int result = n / nn;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("a" + " " +e);
    }
}
}                           
