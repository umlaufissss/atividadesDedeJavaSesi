public class atv6 extends Main
{
    public static void atividade6()
    {
        Smartphone smartphone = new Smartphone();
        smartphone.modelo = "Xingling";
        smartphone.ligado = false;
        smartphone.armazenamento = 128;

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Ligar || [2] - Desligar || [3] - Mostrar info");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            smartphone.ligar();
        }
        else if(escolha == 2)
        {
            smartphone.desligar();
        }
        else if(escolha == 3)
        {
            smartphone.mostrarInfo();
        }
        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade6();
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
