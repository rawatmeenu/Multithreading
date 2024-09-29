public class thread2 implements Runnable{

    public void run()
    {
        System.out.println("thread2 is running");
    }

    public static void main(String args[])
    {
        // We are passing the object of your class that implements Runnable so that your class run() method may execute.
        thread2 t2 = new thread2();
        Thread tt1 = new Thread(t2);
        tt1.start();
    }
}
