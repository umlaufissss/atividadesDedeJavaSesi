package org.example;

import java.util.ArrayList;
import java.util.List;

public class atv2 extends Main
{
    static List<Contato> contatos = new ArrayList<>();

    public static void atividade2()
    {
        int escolha = 0;

        do
        {
            System.out.println("=== AGENDA DE CONTATOS ===\n" +
                    "1. Adicionar contato\n" +
                    "2. Listar contatos\n" +
                    "3. Buscar por nome\n" +
                    "4. Remover contato\n" +
                    "0. Sair\n");

            escolha = SC.nextInt();
            SC.nextLine();

            switch (escolha)
            {
                case 1 -> adicionarContato();
                case 2 -> listarContatos();
                case 3 -> buscarNome();
                case 4 -> removerContato();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("OPÇÃO INVÁLIDA");
            }
        }
        while (escolha !=0);
    }

    public static void adicionarContato()
    {
        String nome, telefone;
        System.out.println("ADICIONAR PRODUTO: ");

        System.out.println("Digite o nome do contato: ");
        nome = SC.nextLine();

        System.out.println("Digite o telefone do contato: ");
        telefone = SC.nextLine();

        contatos.add(new Contato(nome,telefone));

        System.out.println("Contato criado com sucesso!");

        contatos.getLast().exibirDados();
    }

    public static void listarContatos()
    {
        int index = 0;
        if(contatos.isEmpty())
        {
            System.out.println("A lista está vazia");
        }
        else
        {
            for(Contato contato : contatos)
            {
                System.out.println("PRODUTO " + index);
                contato.exibirDados();
                index++;
            }
        }
    }

    public static void buscarNome()
    {
        String nome;
        boolean encontrado = false;

        System.out.println("Digite o nome do seu contato: ");
        nome = SC.nextLine();

        for(Contato contato : contatos)
        {
            if(contato.getNome().equals(nome))
            {
                System.out.println("Contato encontrado!");

                encontrado = true;
                contato.exibirDados();
            }
        }

        if(!encontrado)
        {
            System.out.println("Nenhum contato encotrado");
        }
    }

    public static void removerContato()
    {
        System.out.println("Listando contatos...");

        int index = 0, numero;
        if(contatos.isEmpty())
        {
            System.out.println("A lista está vazia");
        }
        else
        {
            for(Contato contato : contatos)
            {
                System.out.println("PRODUTO " + index);
                contato.exibirDados();
                index++;
            }
        }

        System.out.println("Digite o indíce do contato que queira apagar: ");
        numero = SC.nextInt();
        SC.nextLine();

        if(numero>= 0 && numero<contatos.size())
        {
            contatos.remove(numero);
        }

        System.out.println("Contato apagado com sucesso");
    }
}
