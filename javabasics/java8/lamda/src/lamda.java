
@FunctionalInterface// this annotation will tell u this is a funcitonal interface
interface csar{// car is a concept interface is a concept
    void drive();

}
//class wagnor implements car{
//    public void drive(){
//        System.out.println("driving wagnor");
//    }
//}


public class lamda {
    public static void main(String[] args) {
        csar dd = () ->
        // only one statement curly brackets r optional;
            // this is actually anonimous innner callss as it dont have a name
            System.out.println("driving");// if u need to use a calls only single time this is a solution
            // its better version is lamda expression;
        ;

        dd.drive();
    }
    }
