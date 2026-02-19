public class atv8 extends Main
{
    public static void atividade8()
    {
        int menor21 = 0, maior50 =0;
        int idade;

        do
        {
            System.out.println("Digite a idade:");
            idade = SC.nextInt();

            if(idade<21)
            {
                menor21++;
            }
            if(idade>50)
            {
                maior50++;
            }
        }
        while (idade>=0 && idade<=120);

        System.out.println("Pessoas menores de 21 anos: " + menor21);
        System.out.println("Pessoas maiores de 50 anos: " + maior50);

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
