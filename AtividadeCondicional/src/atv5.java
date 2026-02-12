public class atv5 extends Main
{
    //COMANDO: Construir um algoritmo que indique se o número digitado está compreendido
    //entre 20 e 90 ou não.

    public static void atividade5()
    {
        int num;

        System.out.println("Digite o seu número: ");
        num = SC.nextInt();

        if(num >20 && num <90 )
        {
            System.out.println("Seu número está entre 20 e 90. APPROVED!!");
        }
        else
        {
            System.out.println("Seu número NÃO está entre 20 e 90");

        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
