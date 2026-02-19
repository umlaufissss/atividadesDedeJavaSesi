import java.util.ArrayList;
import java.util.List;

public class atv5 extends Main
{
    public static void atividade5()
    {
        List<String> nomes = new ArrayList<>();
        String nome;

        System.out.println("Digite o seu nome:");
        do
        {
            nome = SC.nextLine();
            nomes.add(nome);
        }
        while (!nome.equalsIgnoreCase("FIM"));

        nomes.remove(nomes.size()-1);

        System.out.println("Nomes:");
        for(String name : nomes)
        {
            System.out.println(name);
        }

        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        inicio();
    }
}
