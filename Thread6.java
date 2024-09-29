public class Thread6 {
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            try{
                Thread.sleep(500);

            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

            System.out.println(i);

        }
    }
}
