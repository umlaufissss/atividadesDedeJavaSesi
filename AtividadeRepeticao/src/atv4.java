public class atv4 extends Main
{
    public static void atividade4()
    {
        int quant,i, num, entre = 0;

        do
        {
            System.out.printf("Digite o número:");
            num = SC.nextInt();

            if(num >=100 && num <=200)
            {
                entre++;
            }
        }
        while (num != 0);

        System.out.println("Você digitou " + entre + " número(s) entre 100 e 200!");

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
