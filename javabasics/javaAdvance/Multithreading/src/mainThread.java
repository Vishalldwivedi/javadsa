public class mainThread {
    public static void main(String[] args) {
        System.out.println("main thread");
        String name = Thread.currentThread().getName();
        System.out.println("name of main thread is : " + name);// main
        System.out.println("priority of main thread is : " + Thread.currentThread().getPriority());// 5

        System.out.println("after changing ");
        Thread t = Thread.currentThread();
        t.setName("vishal");
        t.setPriority(1);





    }
}
