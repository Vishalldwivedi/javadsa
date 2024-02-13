


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class human {// super base parent class
    int age;// instance variable
    private String name;
    human(){
        System.out.println("human class constructor");
    }
    void sleep( ){//behaviour
        age = 10 ;
        System.out.println("human needs good sleep ");
        System.out.println(age);
    }
}
class student extends human {// child sub derived class
        void display(){
            System.out.println("the age is " + age);
         //   System.out.println("the name i s" + name); error as name is private variable
        }
}
public class Main {
    public static void main(String[] args) {
        student st = new student();
        st.sleep();// as no relation ship btw these two classes


        //behind the seen there is a default constructor and in first line of constuctor super method is called
        // means this super mehtod is used to call the parent class constructor
    }
}