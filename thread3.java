public class thread3 {

    public static void main(String args[])
    {
        //can directly use the Thread class to spawn new threads using the constructors.
        Thread t3 = new Thread("my first thread");
        t3.start();
        String str= t3.getName();
        System.out.println(str);

    }
}
