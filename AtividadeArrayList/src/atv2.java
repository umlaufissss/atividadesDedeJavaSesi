import java.util.ArrayList;
import java.util.List;

public class atv2 extends Main
{
    public static void atividade2()
    {
        List<Integer> listaNumero = new ArrayList<>();

        for(int i = 0; i<=10; i++)
        {
            listaNumero.add(i);
        }

        System.out.println("Tamanho: " + listaNumero.size());
        System.out.println("Retirando número 5...");

        listaNumero.remove(5);

        for(int num : listaNumero)
        {
            System.out.println(num);
        }

        System.out.println("Tamanho atual: " + listaNumero.size());

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
