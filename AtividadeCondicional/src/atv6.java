public class atv6 extends Main
{
    //COMANDO: Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a
    //20 ou menor do que 20

    public static void atividade6()
    {
        int num;

        System.out.println("Digite o seu número: ");
        num = SC.nextInt();

        if(num>20)
        {
            System.out.println("Maior do que 20");
        }
        else if(num<20)
        {
            System.out.println("Menor do que 20");
        }
        else
        {
            System.out.println("É 20");
        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
