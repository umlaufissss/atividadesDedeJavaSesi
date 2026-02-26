import java.util.ArrayList;
import java.util.List;

public class atv1 extends Main
{

    // COMANDO: Crie um ArrayList<String>, peça ao usuário para digitar 5 nomes utilizando
    //Scanner e exiba todos os nomes cadastrados utilizando um laço de
    //repetição.

    public static void atividade1()
    {
        List<String> listaNome = new ArrayList<>();

        for(int i =0; i<5;i++)
        {
            System.out.println("Digite o nome " + (i+1) + ": ");
            String nome = SC.nextLine();
            listaNome.add(nome);
        }

        for(String nome : listaNome)
        {
            System.out.println(nome);
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
