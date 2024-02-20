public class innerclass2 {
    class engine{
        void display(){
            System.out.println("in dispaly inner class");
        }
    }
    public static void main(String[] args) {
        System.out.println("in main");
      //  innerclass2 ic = new innerclass2();
       // innerclass2.engine en = ic.new engine();
        //en.display();

//        innerclass2.engine e = new innerclass2().new engine();
//        e.display();

        new innerclass2().new engine().display();
    }
}
