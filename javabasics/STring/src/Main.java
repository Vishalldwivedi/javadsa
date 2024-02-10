//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String name = "vishal";
        System.out.println(name);
        name.concat("dwivedi");//immutable
        System.out.println(name);

        StringBuilder namee = new StringBuilder("vishal");
        System.out.println(namee);
        namee.append("Dwivedi");//muttable
        System.out.println(namee);//changes occures in same object


        String n = "vishal";
        String nn = "vishal";
        System.out.println(n==nn);

        String na = new String("vis");
        String naa = new String("vis");
        System.out.println(na == naa);
        }
    }
