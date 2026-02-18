public class atv1 extends Main
{
    public static void atividade1()
    {
        int i = 100;
        System.out.println("Fazendo contagem regressiva...");

        for(i=100; i>=0;i--)
        {
            System.out.println(i + "...");

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }

        inicio();
    }
}
