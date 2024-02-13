//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Studentss{
    private int age;// data will be accable in same class;
    private String name ;// instance variables
    public void setAge(int age){//a is a local variable
        this.age = age ;// showding problem  when local variable name == instance variable name
// it will give preference to local variable in showding
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String  getName(){
        return name;
    }
}
public class setterGetters {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Studentss obj = new Studentss();
        Studentss obj1 = new Studentss();
//        obj.name = "vishal";// no one should access these directly
//        obj.age = 33;
        obj.setAge(44);// if not do this it will show the default of valiables;
        obj1.setAge(33);
        obj.setName("vishal");
        obj1.setName("vi");
        System.out.println(obj.getAge());
        System.out.println(obj1.getAge());

    }
}