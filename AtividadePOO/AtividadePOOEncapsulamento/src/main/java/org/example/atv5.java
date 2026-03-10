package org.example;

public class atv5 extends Main
{
    public static void atividade5()
    {
        Aluno aluno = new Aluno("Gustavo Lazarotto Bertol", 10, 10);

        System.out.println("Calculando média...");
        aluno.calcularNota();

        aluno.mostrarSituacao();

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
