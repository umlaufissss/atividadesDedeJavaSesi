public class atv2 extends Main
{

    // COMANDO: Implemente um programa que receba do usuário 5 números por meio do Scanner,
    //armazene-os em um vetor e apresente a soma total dos valores digitados.

    public static void atividade2()
    {
        int[] numeros = new int[5];
        int num = 0;

        System.out.println("Digite seus números: ");

        for(int i = 0; i<5;i++)
        {
            System.out.println("Número " + (i+1) + ":");
            numeros[i] = SC.nextInt();
            num += numeros[i];
        }

        System.out.println("A soma de todos os números é: " + num);

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
