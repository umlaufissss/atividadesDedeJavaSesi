public class atv9 extends Main
{
    public static void atividade9()
    {
        System.out.println("Digite um número: ");
        int numero = SC.nextInt();

        if(verificarPrimo(numero))
        {
            System.out.println("É primo");
        }
        else
        {
            System.out.println("Não é primo");
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

    public static boolean verificarPrimo(int numero)
    {
        if (numero <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++)
        {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
