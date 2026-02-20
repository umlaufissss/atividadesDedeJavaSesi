public class atv4 extends Main
{
    public static void atividade4()
    {
        int[] numeros = {1,2,3,4,5,6};
        int somaPar = 0;

        for(int i = 0; i<6 ;i++)
        {
            if(numeros[i]%2 == 0)
            {
                somaPar +=numeros[i];
            }
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
