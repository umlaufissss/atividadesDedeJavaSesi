package org.example;

public class atv1 extends Main
{
    public static void atividade1()
    {
        Pessoa pessoa = new Pessoa("Gustavo Lazarotto Bertol", 17);

        pessoa.apresentar();

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
