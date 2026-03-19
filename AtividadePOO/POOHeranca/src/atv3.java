import java.util.ArrayList;
import java.util.List;

public class atv3 extends Main
{
    //SISTEMA ESCOLA
    public static void atividade3()
    {
        List<atv3Pessoa> pessoas = new ArrayList<>();

        String nome, cpf, disciplina, curso;
        long matricula;
        int idade, escolha, opcao = 0;
        double salario;
        boolean cadastro = false;

        do
        {
            System.out.println("Por favor, escolha a opção de pessoa que você quer cadastrar: ");
            System.out.println("[1] - Aluno");
            System.out.println("[2] - Professor");
            escolha = SC.nextInt();
            SC.nextLine();

            System.out.println("Por favor, digite os dados da sua pessoa:");

            System.out.println("Nome: ");
            nome = SC.nextLine();

            System.out.println("CPF: ");
            cpf = SC.nextLine();

            System.out.println("Idade: ");
            idade = SC.nextInt();
            SC.nextLine();

            switch (escolha)
            {
                case 1:
                {
                    System.out.println("Matricula: ");
                    matricula = SC.nextLong();
                    SC.nextLine();

                    System.out.println("Curso: ");
                    curso = SC.nextLine();

                    pessoas.add(new atv3Aluno(nome, cpf, idade, matricula, curso));

                    pessoas.getLast().exibirDados();
                    cadastro = true;

                    break;
                }
                case 2:
                {
                    System.out.println("Disciplina: ");
                    disciplina = SC.nextLine();

                    System.out.println("Salário: ");
                    salario = SC.nextDouble();
                    SC.nextLine();

                    pessoas.add(new atv3Professor(nome, cpf, idade, disciplina, salario));

                    pessoas.getLast().exibirDados();
                    cadastro = true;

                    break;
                }
                default:
                {
                    System.out.println("Opção inválida: ");
                    break;
                }
            }

            if (cadastro)
            {
                System.out.println("Você gostaria de cadastrar o outro tipo de pessoa?");
                System.out.println("[1] - SIM");
                System.out.println("[0] - NÃO");
                opcao = SC.nextInt();
                SC.nextLine();
            }
        }
        while (opcao !=0);

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
