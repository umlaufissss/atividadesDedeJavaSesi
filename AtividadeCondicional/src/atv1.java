public class atv1 extends Main
{
    //COMANDO:  Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
    //caso o resultado seja maior que 10, apresentá-lo.
    public static void atividade1()
    {
        int n1,n2;

        System.out.println("Digite o primeiro número: ");
        n1 = SC.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = SC.nextInt();

        if(n1+n2 >=10)
        {
            System.out.println("A soma dos seus números é maior ou igual que 10! Olá " + (n1+n2) + "!\n");
        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
