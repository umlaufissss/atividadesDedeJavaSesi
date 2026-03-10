package org.example;

public class atv2 extends Main
{
    public static void atividade2()
    {
        Produto produto = new Produto("Abacate", 16.99, 2);

        produto.exibirProduto();

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
