package org.example;

public class atv4 extends Main
{
    public static void atividade4()
    {
        double velocidade;

        Carro carro = new Carro("Mercedez", 2022, 275 );

        System.out.println("Digite o quanto você quer acelerar...");
        velocidade = SC.nextInt();
        SC.nextLine();

        carro.acelerar(velocidade);

        System.out.println("Digite o quanto você quer freiar...");
        do
        {
            velocidade = SC.nextInt();
            carro.freiar(velocidade);
        }
        while (!carro.freiar(velocidade));

        System.out.println("Mostrando as informações do carro...");
        carro.mostrarVelocidade();

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
