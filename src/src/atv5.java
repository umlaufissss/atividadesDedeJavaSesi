public class atv5 extends Main
{
    //COMANDO:  Peça ao usuário que insira três nomes e exiba todos eles.

    public static void atividade5()
    {
        String n1, n2, n3;

        System.out.println("Digite o primeiro nome: ");
        n1 = SC.nextLine();

        System.out.println("Digite o segundo nome: ");
        n2 = SC.nextLine();

        System.out.println("Digite o terceiro nome: ");
        n3 = SC.nextLine();

        System.out.println("Os nomes digitados são: " + n1 + ", " + n2 + " e " + n3 + "\n");

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupted();
        }
        inicio();
    }
}
