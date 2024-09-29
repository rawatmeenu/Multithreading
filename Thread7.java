public class Thread7 extends Thread{
//setting the name using .setname()
    public void run(){
        System.out.println("Running");}

    public static void main(String args[])
    {
        Thread7 t7 = new Thread7();
        Thread7 t8 = new Thread7();
        t7.start();
        t8.start();

        System.out.println(t7.getName());
        System.out.println(t8.getName());

        t7.setName("the first thread");
        System.out.println("after changing" + t7.getName());

    }
}
