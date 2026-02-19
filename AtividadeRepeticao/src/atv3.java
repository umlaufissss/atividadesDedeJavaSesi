public class atv3 extends Main
{
    public static void atividade3()
    {
        int quant,i, num;
        double media = 0;
        
        System.out.println("Digite quantos números gostaria de digitar");
        quant = SC.nextInt();
        SC.nextLine();

        for (i = 1; i<=quant; i++)
        {
            System.out.printf("Digite o número:");
            num = SC.nextInt();

            if(num>=0)
            {
                media += num;
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
