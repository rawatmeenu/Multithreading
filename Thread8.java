public class Thread8 extends Thread{

    public void run(){
        System.out.println("this thread is running");
    }

    public Thread8(String threadname)
    {
        super(threadname);
    }

    public static void main(String args[])
    {
        Thread8 t8 = new Thread8("this is the first thread");
        Thread8 t9 = new Thread8("this is seconf thread");
        t8.start();
        t9.start();
        System.out.println(t8.getName());
        System.out.println(t9.getName());
    }
}
