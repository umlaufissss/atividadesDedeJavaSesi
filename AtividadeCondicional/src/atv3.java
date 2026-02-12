import java.math.*;

public class atv3 extends Main
{
    //COMANDO: Entrar com um número e imprimir a raiz quadrada do número caso ele seja
    //positivo e o quadrado do número caso seja negativo.

    public static void atividade3()
    {
        int num;
        Math math;

        System.out.println("Digite o seu número: ");
        num = SC.nextInt();

        if(num>0)
        {
            System.out.println("Raiz quadrada: " + Math.sqrt(num) );
        }
        else if (num<0)
        {
            System.out.println("Número ao quadrado: " + Math.pow(num, 2));
        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
