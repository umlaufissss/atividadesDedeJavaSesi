import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("┌────────────────────────────────────────────┐");
        System.out.println("│Digite qual questão você gostaria de entrar:│");
        System.out.println("├────────────────────────────────────────────┤");
        System.out.println("│[1]                     [3]                 │");
        System.out.println("│[2]                     [4]                 │");
        System.out.println("├────────────────────────────────────────────┤");
        System.out.println("│[9] - SAIR                                  │");
        System.out.println("└────────────────────────────────────────────┘");

        int escolha = SC.nextInt();
        SC.nextLine();

        switch (escolha)
        {
            case 1 ->atv1.atividade1();
            case 2 ->atv2.atividade2();
            case 3 ->atv3.atividade3();
            case 4 ->atv4.atividade4();
            case 9-> System.exit(0);
            default->
            {
                System.out.println("Opção inválida!");
                inicio();
                break;
            }
        }
    }
}