public class atv2 extends Main
{
    //COMANDO: Construir um algoritmo que leia dois números e efetue a adição. Caso o valor
    //somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

    public static void atividade2()
    {
        int n1,n2;

        System.out.println("Digite o primeiro número: ");
        n1 = SC.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = SC.nextInt();

        if(n1+n2 <= 20)
        {
            System.out.println("A soma dos seus números é maior ou igual que 20! Olá " + (n1+n2-5) + "!\n");
        }
        else
        {
            System.out.println("Seu número é: " + (n1+n2));
        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
