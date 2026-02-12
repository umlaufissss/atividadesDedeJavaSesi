public class atv8 extends Main
{
    //COMANDO: Entrar com dois números e imprimir o maior número (suponha números
    //diferentes).

    public static void atividade8()
    {
        int n1,n2,n3;

        System.out.println("Digite o primeiro número: ");
        n1 = SC.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = SC.nextInt();

        if(n1>n2)
        {
            System.out.println(n1 + " é maior!");
        }
        else
        {
            System.out.println(n2 + " é maior");
        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
