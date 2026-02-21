public class atv3 extends Main
{

    //COMANDO:  Desenvolva um programa que utilize dois vetores com 5 posições, permita que o usuário
    //preencha ambos, gere um terceiro vetor contendo a soma das posições correspondentes e
    //exiba o resultado.

    public static void atividade3()
    {
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int[] sum = new int[5];

        System.out.println("Digite os números da lista 1: ");
        for(int i = 0; i<5; i++)
        {
            System.out.println("Número " + (i+1) + ":");
            num1[i] = SC.nextInt();
            sum[i] = num1[i];
        }

        System.out.println("Digite os números da lista 2: ");
        for(int i = 0; i<5; i++)
        {
            System.out.println("Número " + (i+1) + ":");
            num2[i] = SC.nextInt();
            sum[i] += num2[i];
        }

        System.out.println("A soma dos seus números da lista 1 e 2, por posição, é: ");
        for(int i = 0; i<5; i++)
        {
            System.out.println("Número " + (i+1) + ":" + sum[i]);
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
