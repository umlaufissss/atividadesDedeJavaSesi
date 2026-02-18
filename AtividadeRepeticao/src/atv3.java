public class atv3 extends Main
{
    public static void atividade3()
    {
        int quant, media = 0,i, num;
        System.out.println("Digite quantos números gostaria de digitar");
        quant = SC.nextInt();

        System.out.printf("Digite o número:");
        for (i = 0; i<=quant; i++)
        {
            num = SC.nextInt();

            if(num>=0)
            {
                media += SC.nextInt();
            }
            else
            {
                System.out.println("Ops...Número negativo!");
                i--;
            }
        }

        media = media/quant;

        System.out.println("A media dos números digitados é: " + media);

        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        inicio();

    }
}
