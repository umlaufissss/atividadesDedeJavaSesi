package org.example;

public class atv3 extends Main
{
    public static void atividade3()
    {
        int dindin;

        ContaBancaria contaBancaria = new ContaBancaria("Gustavo Lazarotto Bertol", 100000000);

        System.out.println("Digite quantos reais você quer sacar...");
        do
        {
            dindin = SC.nextInt();
            contaBancaria.sacar(dindin);
        }
        while (!contaBancaria.sacar(dindin));

        SC.nextLine();

        System.out.println("Digite quantos reais você quer depositar...");
        dindin = SC.nextInt();
        SC.nextLine();

        System.out.println("Mostrando os dados da sua conta...");
        contaBancaria.mostrarSaldo();

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
