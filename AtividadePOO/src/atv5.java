public class atv5 extends Main
{
    public static void atividade5()
    {
        PocaoMagica pocaoMagica = new PocaoMagica();
        pocaoMagica.tipo = "da Fada Madrinha";
        pocaoMagica.potencia = 100;
        pocaoMagica.quantidade = 1;

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Usar poção || [2] - Recarregar poção");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            pocaoMagica.usar();
        }
        else if(escolha == 2)
        {
            pocaoMagica.recarregar();
        }
        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade5();
        }

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
