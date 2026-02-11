import java.util.Scanner;

public class Main
{
    static Scanner SC = new Scanner(System.in);

    public static void main(String[] args)
    {
       inicio();
    }

    public static void inicio()
    {
        System.out.println("Atividades do professor Dedé: \nAula - Entrada de Dados (Scanner)");

        System.out.println("Digite qual questão você gostaria de entrar:");
        System.out.println("[1]                     [5]");
        System.out.println("[2]                     [6]");
        System.out.println("[3]                     [7]");
        System.out.println("[4]                     [8]");
        System.out.println("[9] - SAIR");

        int escolha = SC.nextInt();
        SC.nextLine();

        switch (escolha)
        {
            case 1 ->atv1.atividade1();
            case 2 ->atv2.atividade2();
            case 3 ->atv3.atividade3();
        }
    }
}