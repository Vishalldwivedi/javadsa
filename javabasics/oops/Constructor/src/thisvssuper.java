
class stu{
    private  String name;
    private int age;

    public stu(){
        this("vishal " , 33);// call two parameticx consttor in same class
        System.out.println("this is defalut constructor");
        name = "vis";
        age = 29 ;
    }
    public stu(String name){
        this();// call zero parameterised constuctor in same class;
        this.name = name;
        age = 19 ;
    }
    public stu(String name , int age){
        this.name = name ;
        this.age = age ;
    }
    public void dispay (){
        System.out.println(name);
        System.out.println(age);
    }

}
public class thisvssuper {
    public static void main(String[] args) {

    }
}
