
 class bemo{
    //handling vs ducking exception ;
   public void a()throws Exception{
    b();
    }
  public   void b()throws Exception{
      int n = 8 ;
      int  nn = 0 ;
      int num = n / nn ;
      System.out.println(num);
  }
}
public class throwss {
    public static void main(String[] args) {
bemo obj = new bemo();
try{
    obj.a();
 } catch(Exception e){
    System.out.println("divide by zero exceptoin" + " " + e);
 }
    }
}
