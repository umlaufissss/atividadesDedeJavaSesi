public class atv7 extends Main
{
    public static void atividade7()
    {
        Carro carro = new Carro();
        carro.marca = "Mustang";
        carro.cor = "Preto";
        carro.velocidadeAtual = 200;

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Acelerar || [2] - Freiar || [3] - Mostrar velocidade atual");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            carro.acelerar();
        }
        else if(escolha == 2)
        {
            carro.freiar();
        }
        else if(escolha == 3)
        {
            carro.mostrarVelocidade();
        }
        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade7();
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
