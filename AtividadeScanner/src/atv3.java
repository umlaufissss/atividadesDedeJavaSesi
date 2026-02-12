public class atv3 extends Main
{
    //COMANDO: Crie um programa que simplesmente exibe uma mensagem informativa sobre
    //o que é Java.

    public static void atividade3()
    {
        int opcao;

        System.out.println("Você gostaria de saber da palavra do JAVA?");
        System.out.println("[1] - SIM   | [2] - NÃO");
        opcao = SC.nextInt();
        SC.nextLine();

        if(opcao == 1)
        {
            System.out.println("JAVA é melhor do que PYTHON!");
        }
        else if (opcao == 2)
        {
            System.out.println("Não? Tenha um bom dia... Nem todos gostariam de abrir os olhos");
        }
        else
        {
            System.out.println("Opção inválida, tente de novo!");
            atividade3();
        }

        System.out.println("\n");

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
