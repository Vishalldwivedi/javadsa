public class Exception1 {
    public static void main(String[] args) {
       int num= 9 ;
       int num2 = 0 ;
       int div = 0 ;
try {
     div = num / num2;// if this throws a exception this will throw a exception object
}
catch(Exception obj){
   // u want to tell the user about the exceptoin
    System.out.println("something went wrong" + " " + obj);
}
        System.out.println(div);
    }
}
