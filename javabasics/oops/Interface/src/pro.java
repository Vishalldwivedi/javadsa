//abstract class computer {
//    abstract public void compileCode();
//}
// abstract class object can not be formed but reference can
// -> we can make interface of it

interface computer {
    void compileCode();
}


class laptop implements computer{
    public void compileCode(){
        System.out.println("u got errors");
    }
}

class desktop implements computer{
    public void compileCode(){
        System.out.println("u got errors  faster");
    }
}


class developer{
  //  laptop obj = new laptop();// now object will created one time only .but we want company to decide how many laptops
    // r needed. there for we creat laptop obj refrence in the main class
    public void buildApp(computer obj){
        System.out.println("building app");
        // compileCode(); we r not able to call this method
       // laptop obj = new laptop();
        obj.compileCode();
    }
}
public class pro {
    public static void main(String[] args) {
        //laptop obj  =new laptop();
       //  desktop obj = new desktop();
        computer obj = new desktop();// parent class ref and child class object
        developer dev = new developer();
        dev.buildApp(obj);

        // issue solved developer can work with any type of object now object should be a computer ;
    }
}
