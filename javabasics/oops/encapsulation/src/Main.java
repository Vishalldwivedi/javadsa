//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Students{
    private int age;// data will be accable in same class;
    private String name ;// instance variables
    public void setData1(int age){//a is a local variable
          this.age = age ;// showding problem  when local variable name == instance variable name
// it will give preference to local variable in showding
    }
    public void setData2(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name + " " +  age);
    }

}
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Students obj = new Students();
        Students obj1 = new Students();
//        obj.name = "vishal";// no one should access these directly
//        obj.age = 33;
        obj.setData1(44);// if not do this it will show the default of valiables;
        obj1.setData1(33);
        obj.setData2("vishal");
        obj1.setData2("vi");
        obj1.show();
        obj.show();

    }
}