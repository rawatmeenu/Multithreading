public class Thread5 extends Thread{

    public void run(){
        for(int i=1;i<5;i++)
        {
            try{
                Thread.sleep(500);}
            catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            System.out.println(i);
        }
    }



    public static void main(String args[])
    {
        Thread5 t5 = new Thread5();
        t5.start();


    }
}
