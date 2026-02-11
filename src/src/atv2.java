public class atv2 extends Main
{
    //COMANDO: Pergunte ao usuário dois números e exiba a soma deles.

    public static void atividade2()
    {
        int n1, n2;

        System.out.println("Digite o seu primeiro número: ");
        n1 = SC.nextInt();
        SC.nextLine();

        System.out.println("Digite o seu segundo número:");
        n2 = SC.nextInt();
        SC.nextLine();

        System.out.println("A soma dos dois números é: " + (n1+n2) + "\n");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
