public class atv8 extends Main
{
    //COMANDO: Pergunte ao usuário duas notas e calcule a média, exibindo o resultado.

    public static void atividade8()
    {
        float n1, n2, media;

        System.out.println("Digite sua primeira nota: ");
        n1 = SC.nextFloat();

        System.out.println("Digite sua segunda nota: ");
        n2 = SC.nextFloat();

        media = (n1+n2)/2f;

        System.out.println("Sua média é: " + media + "\n");

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
