public class atv2 extends Main
{
    public static void atividade2()
    {
        int n=0, i = 0;

        while (n!=101)
        {
            System.out.println(i + "...");

            i+=2;
            n++;
        }

        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        inicio();
    }
}
