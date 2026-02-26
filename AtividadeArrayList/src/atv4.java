import java.util.ArrayList;
import java.util.List;

public class atv4 extends Main
{
    public static void atividade4()
    {
        List<Integer>listNum = new ArrayList<>();
        int n = 0;

        for(int i = 0;i<5;i++)
        {
            System.out.println("Digite número " + (i+1) + ": ");
            int num = SC.nextInt();
            SC.nextLine();

            listNum.add(num);
        }

        for(int num : listNum)
        {
            n+=num;
        }

        System.out.println("A soma de todos os números é: " + n);
        System.out.println("Enquanto a média desses números é: " +n/5);

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
