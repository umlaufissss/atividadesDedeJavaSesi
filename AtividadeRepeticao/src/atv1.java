public class atv1 extends Main
{

    //COMANDO: 1) Imprimir na tela todos os números de 100 a 1 (contagem regressiva).
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
