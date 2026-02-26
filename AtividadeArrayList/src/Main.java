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
        System.out.println("Atividades do professor Dedé: \nAula - ArrayList");

        System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("┌────────────────────────────────────────────┐");
        System.out.println("│Digite qual questão você gostaria de entrar:│");
        System.out.println("├────────────────────────────────────────────┤");
        System.out.println("│[1]                     [2]                 │");
        System.out.println("│[3]                     [4]                 │");
        System.out.println("│[5]                                         │");
        System.out.println("├────────────────────────────────────────────┤");
        System.out.println("│[0] - SAIR                                  │");
        System.out.println("└────────────────────────────────────────────┘");

        int escolha = SC.nextInt();
        SC.nextLine();

        switch (escolha)
        {
            case 1 ->atv1.atividade1();
            case 2 ->atv2.atividade2();
            case 3 ->atv3.atividade3();
            case 4 ->atv4.atividade4();
            case 5 ->atv5.atividade5();
            case 0-> System.exit(0);
            default->
            {
                System.out.println("Opção inválida!");
                inicio();
            }
        }
    }
}