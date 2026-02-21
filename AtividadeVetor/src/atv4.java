public class atv4 extends Main
{

    //COMANDO:  Considerando um vetor com 6 números pré-definidos, percorra seus elementos, calcule a
    //soma apenas dos números pares e apresente o resultado final.

    public static void atividade4()
    {
        int[] numeros = {1,2,3,4,5,6};
        int somaPar = 0;

        System.out.println("Seus números são: ");
        for(int i = 0; i<6 ;i++)
        {
            System.out.print("Número " + (1+i) + ": " + numeros[i]);
            if(numeros[i]%2 == 0)
            {
                somaPar +=numeros[i];
                System.out.print(" = PAR");
            }
            System.out.print("\n");
        }

        System.out.println("A soma de todos os números pares dentro de sua lista é: " + somaPar);

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
