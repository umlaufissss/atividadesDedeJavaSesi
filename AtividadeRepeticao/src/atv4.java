public class atv4 extends Main
{

    //COMANDO: 4) Ler vários números e informar quantos números entre 100 e 200 foram
    //digitados. Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua
    //execução.

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
