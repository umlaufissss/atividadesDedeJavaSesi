public class atv7 extends Main
{
    public static void atividade7()
    {
        int n =0;

        System.out.println("Números de 1 a 100");
        for(int i = 0; i<=100;i++)
        {
            System.out.println(i);
        }

        System.out.println("A soma deles: ");
        for(int i = 0; i<=100; i++)
        {
            n+=i;
            System.out.println(n);
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
