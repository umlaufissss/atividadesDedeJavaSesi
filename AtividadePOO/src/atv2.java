public class atv2 extends Main
{
    public static void atividade2()
    {
        FoneDeOuvido foneDeOuvido = new FoneDeOuvido();

        foneDeOuvido.marca = "JotaBêEle";
        foneDeOuvido.conectado = true;
        foneDeOuvido.volume = 98;

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Aumentar Volume || [2] - Conectar || [3] - Desconectar");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            foneDeOuvido.aumentarVolume();
        }
        else if(escolha == 2)
        {
            foneDeOuvido.conectar();
        }
        else if(escolha == 3)
        {
            foneDeOuvido.desconectar();
        }
        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade2();
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
