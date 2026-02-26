import java.util.ArrayList;
import java.util.List;

public class atv3 extends Main
{
    public static void atividade3()
    {
        List<String> listaCor = new ArrayList<>();
        listaCor.add("Azul");
        listaCor.add("Vermelho");
        listaCor.add("Verde");
        listaCor.add("Amarelo");
        listaCor.add("Laranja");

        System.out.println("Digite uma cor: ");
        String cor = SC.nextLine();

        if(listaCor.contains(cor))
        {
            System.out.println("Essa cor tem na lista");
        }
        else
        {
            System.out.println("Essa cor não tem na lista");
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
