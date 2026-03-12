package org.example;

import java.util.ArrayList;
import java.util.List;

public class atv3 extends Main {
    static List<cadastroAluno> alunos = new ArrayList<>();

    public static void atividade3() {
        int escolha = 0;
        do {
            System.out.println("=== CADASTRO DE ALUNOS ===\n" +
                    "1. Adicionar aluno\n" +
                    "2. Listar alunos\n" +
                    "3. Buscar aluno por nome\n" +
                    "4. Mostrar aprovados\n" +
                    "5. Mostrar reprovados\n" +
                    "6. Calcular média da turma\n" +
                    "0. Sair");

            escolha = SC.nextInt();
            SC.nextLine();

            switch (escolha) {
                case 1 -> adicionarAluno();
                case 2 -> listarAlunos();
                case 3 -> buscarAlunoNome();
                case 4 -> mostrarAprovados();
                case 5 -> mostrarReprovados();
                case 6 -> calcularMedia();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }
        while (escolha != 0);
    }

    public static void adicionarAluno()
    {
        String nome;
        double nota1, nota2;

        System.out.println("Digite o nome do aluno: ");
        nome = SC.nextLine();

        System.out.println("Digite a nota 1 do aluno: ");
        nota1 = SC.nextInt();
        SC.nextLine();

        System.out.println("Digite a nota 2 do aluno: ");
        nota2 = SC.nextInt();
        SC.nextLine();

        alunos.add(new cadastroAluno(nome,nota1,nota2));

        System.out.println("Aluno criado com sucesso!");

        alunos.getLast().exibirDados();
    }

    public static void listarAlunos()
    {
        int index = 0;
        if(alunos.isEmpty())
        {
            System.out.println("A lista está vazia");
        }
        else
        {
            for(cadastroAluno aluno  : alunos)
            {
                System.out.println("PRODUTO " + index);
                aluno.exibirDados();
                index++;
            }
        }
    }

    public static void buscarAlunoNome()
    {
        String nome;
        boolean encontrado = false;

        System.out.println("Digite o nome do seu aluno: ");
        nome = SC.nextLine();

        for(cadastroAluno aluno : alunos)
        {
            if(aluno.getNome().equals(nome))
            {
                System.out.println("Aluno encontrado!");

                encontrado = true;
                aluno.exibirDados();
            }
        }

        if(!encontrado)
        {
            System.out.println("Nenhum aluno encotrado");
        }
    }

    public static void mostrarAprovados()
    {
        for(cadastroAluno aluno : alunos)
        {
            if(aluno.obterSituacao().equals("APROVADO"))
            {
                aluno.exibirDados();
            }
        }
    }

    public static void mostrarReprovados()
    {
        for(cadastroAluno aluno : alunos)
        {
            if(aluno.obterSituacao().equals("REPROVADO"))
            {
                aluno.exibirDados();
            }
        }
    }

    public static void calcularMedia()
    {
        int alunoSala = 0;
        double media = 0;

        for (cadastroAluno aluno : alunos)
        {
            media += aluno.calcularMedia();
            alunoSala ++;
        }

        System.out.println("A média da sala é " + (media/alunoSala));
    }
}

