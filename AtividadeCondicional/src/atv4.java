import java.math.*;

public class atv4 extends Main
{
    //COMANDO: 4) Ler três números e escrevê-los em ordem crescente (suponha números
    //diferentes).

    public static void atividade4()
    {
        int n1,n2,n3;

        System.out.println("Digite o primeiro número: ");
        n1 = SC.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = SC.nextInt();

        System.out.println("Digite o terceiro número: ");
        n3 = SC.nextInt();

        int maior = Math.max(n1 , Math.max(n2,n3));
        int menor = Math.min(n1, Math.min(n2,n3));
        int meio = (n1+n2+n3) - maior - menor;

        System.out.println("Os números em ordem crescente são: ");
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        //Me recuso a usar if-else nisso

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
