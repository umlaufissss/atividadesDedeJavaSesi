public class atv9 extends Main
{
    //COMANDO: Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é

    public static void atividade9()
    {
        int num;

        System.out.println("Digite o seu número: ");
        num = SC.nextInt();

        if(num%3 == 0)
        {
            System.out.println("É multiplo de 3");
        }
        else
        {
            System.out.println("Não é multiplo de 3");
        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
