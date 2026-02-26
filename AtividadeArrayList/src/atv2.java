import java.util.ArrayList;
import java.util.List;

public class atv2 extends Main
{

    // COMANDO: Desenvolva um ArrayList<Integer>, adicione os números de 1 a 10 utilizando
    //um for, remova o número 5 da lista, exiba a lista atualizada e informe o
    //tamanho da lista após a remoção.

    public static void atividade2()
    {
        List<Integer> listaNumero = new ArrayList<>();

        for(int i = 0; i<=10; i++)
        {
            System.out.println(i);
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
