public class atv9 extends Main
{
    public static void atividade9()
    {
        System.out.println("Digite um número: ");
        int numero = SC.nextInt();

        if(numero <=1)
        {
            System.out.println("Número não pode ser primo");
        }
        else
        {
            for(int i = 2; i<=Math.sqrt(numero); i++)
            {
                if(numero % i == 0 )
                {
                    System.out.println("Número é primo");
                }
                else
                {
                    System.out.println("Número não é primo");
                }
            }

            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }

            inicio();
        }
    }
}
