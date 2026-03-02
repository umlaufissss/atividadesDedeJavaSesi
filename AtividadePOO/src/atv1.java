import java.util.InputMismatchException;

public class atv1 extends Main
{
    public static void atividade1()
    {
        Espada espada = new Espada();
        espada.nome = "Escalibur";
        espada.dano = 1000;
        espada.material = "Ferro Estígio";

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Atacar || [2] - Afiar");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            espada.atacar();
        }
        else if(escolha == 2)
        {
            espada.afiar();
        }
        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade1();
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
