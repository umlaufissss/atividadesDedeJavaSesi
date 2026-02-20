import java.util.Scanner;

public class Main {

    static Scanner SC = new Scanner(System.in);
    public static void main(String[] args)
    {
        inicio();
    }
    public static void inicio() {
        System.out.println("Atividades do professor Dedé: \nAula - Entrada de Dados (Condicional)");

        System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("┌────────────────────────────────────────────┐");
        System.out.println("│Digite qual questão você gostaria de entrar:│");
        System.out.println("├────────────────────────────────────────────┤");
        System.out.println("│[1]                     [5]                 │");
        System.out.println("│[2]                     [6]                 │");
        System.out.println("│[3]                     [7]                 │");
        System.out.println("│[4]                     [8]                 │");
        System.out.println("│[9]                                         │");
        System.out.println("├────────────────────────────────────────────┤");
        System.out.println("│[10] - SAIR                                 │");
        System.out.println("└────────────────────────────────────────────┘");

        int escolha = SC.nextInt();
        SC.nextLine();

        switch (escolha) {
            case 1 -> atv1.atividade1();
            case 2 -> atv2.atividade2();
            case 3 -> atv3.atividade3();
            case 4 -> atv4.atividade4();
            case 5 -> atv5.atividade5();
            case 6 -> atv6.atividade6();
            case 7 -> atv7.atividade7();
            case 8 -> atv8.atividade8();
            case 9 -> atv9.atividade9();
            case 10 -> System.exit(0);
            default -> {
                System.out.println("Opção inválida!");
                inicio();
                break;
            }
        }
    }
}