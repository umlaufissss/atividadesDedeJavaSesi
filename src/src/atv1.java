import java.util.*;

public class atv1 extends Main
{
    //COMANDO: Peça ao usuário seu nome e exiba uma mensagem de saudação
    //personalizada.
    public static void atividade1()
    {
        String nome;

        System.out.println("Olá, digite o seu nome:");
        nome = SC.nextLine();

        System.out.println("Seja bem-vindo, " + nome + "\n");

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
