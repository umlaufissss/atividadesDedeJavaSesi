public class atv6 extends Main
{
    public static void atividade6()
    {
        int a = 120, b = 120;


        for(int i = 120; i<=300;i++)
        {
            for(int f = 120; f<=300;i++)
            {
                System.out.println(a + " + " + b + " = " + a*b);
                b++;
            }
            a++;
        }

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        inicio();
    }
}
