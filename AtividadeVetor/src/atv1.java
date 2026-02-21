public class atv1 extends Main
{

    //COMANDO:  Utilizando um vetor com 5 números inteiros pré-definidos, exiba todos os seus valores e
    //calcule mostrando a soma total dos elementos.

    public static void atividade1()
    {
        int[] numeros = {23,24,25,26,27};
        int soma = 0;

        System.out.println("Seus números: ");

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Número " +(i+1)+ ": " + numeros[i]);
            soma+=numeros[i];
        }

        System.out.println("A soma de todos esses números é: " + soma);

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
