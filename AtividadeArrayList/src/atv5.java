import java.util.ArrayList;
import java.util.List;

public class atv5 extends Main
{
    public static void atividade5()
    {
        List<String> listPalavra = new ArrayList<>();

        for(int i = 0; i<5;i++)
        {
            System.out.println("Digite palavra " + (i+1) + ": ");
            String palavra = SC.nextLine();
            listPalavra.add(palavra);
        }

        System.out.println("Suas inserções na ordem inversa: ");
        for(int i = 4; i >= 0; i--)
        {
            System.out.println(listPalavra.get(i));
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
