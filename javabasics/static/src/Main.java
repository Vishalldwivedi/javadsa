//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int age ;
    static{//static block
        age = 19 ;
        System.out.println("first");
    }
    static void display(){
        System.out.println("static dis method");
    }
    public static void main(String[] args) {
        Main.display();
        System.out.println("second");

// if not called display it will not display;


    }
}