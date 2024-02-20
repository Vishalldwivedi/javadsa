interface car{// car is a concept interface is a concept
    void drive();

}
//class wagnor implements car{
//    public void drive(){
//        System.out.println("driving wagnor");
//    }
//}


public class anonimousinnerclass {
    public static void main(String[] args) {
        car dd =new car()
        {
            public void drive(){// this is actually anonimous innner callss as it dont have a name
                System.out.println("driving");// if u need to use a calls only single time this is a solution
                // its better version is lamda expression;
            }
        }
                ;
        dd.drive();

    }
}
