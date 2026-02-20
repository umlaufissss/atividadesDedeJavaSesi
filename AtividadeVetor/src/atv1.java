public class atv1 extends Main
{
    public static void atividade1()
    {
        int[] numeros = {23,24,25,26,27};
        int soma = 0;

        System.out.println("Seus números: ");

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Número " +i+ ": " + numeros[i]);
            soma+=numeros[i];
        }

        System.out.println("A soma de todos esses números é: ");

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
