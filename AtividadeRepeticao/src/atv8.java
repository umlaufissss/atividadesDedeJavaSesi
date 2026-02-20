public class atv8 extends Main
{
    //COMANDO: 8) Entrar com a idade de várias pessoas e imprimir: total de pessoas com menos
    //de 21 anos e total de pessoas com mais de 50 anos. Parar quando for digitada
    //uma idade fora da faixa 0-120 anos.

    public static void atividade8()
    {
        int menor21 = 0, maior50 =0;
        int idade;

        do
        {
            System.out.println("Digite a idade:");
            idade = SC.nextInt();

            if(idade<21 && idade > -1)
            {
                menor21++;
            }
            if(idade>50 && idade <121)
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
