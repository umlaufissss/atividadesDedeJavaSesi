package org.example;

import java.util.ArrayList;
import java.util.List;

public class atv1 extends Main
{
    static List<sistemaProduto> sistemaProdutos = new ArrayList<>();

    public static void atividade1()
    {
        int escolha = 0;
        do
        {
            System.out.println("=== CADASTRO DE PRODUTOS ===\n" +
                    "1. Adicionar produto\n" +
                    "2. Listar produtos\n" +
                    "3. Contar produtos\n" +
                    "0. Sair");

            escolha = SC.nextInt();
            SC.nextLine();

            switch (escolha)
            {
                case 1 -> adicionarProduto();
                case 2 -> listarProdutos();
                case 3 -> contarProdutos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }
        while (escolha !=0);
    }

    public static void adicionarProduto()
    {
        String nome;
        double preco;
        int quantidade;

        System.out.println("ADICIONAR PRODUTO: ");

        System.out.println("Digite o nome o produto: ");
        nome = SC.nextLine();

        System.out.println("Digite o preço do produto: ");
        preco = SC.nextDouble();
        SC.nextLine();

        System.out.println("Digite a quantidade do produto:");
        quantidade = SC.nextInt();
        SC.nextLine();

        sistemaProdutos.add(new sistemaProduto(nome,preco,quantidade));

        System.out.println("Produto adicionado com sucesso!");

        sistemaProdutos.getLast().exibirDados();
    }

    public static void listarProdutos()
    {
        int index = 0;
        if(sistemaProdutos.isEmpty())
        {
            System.out.println("A lista está vazia");
        }
        else
        {
            for(sistemaProduto sistemaProduto : sistemaProdutos)
            {
                System.out.println("PRODUTO " + index);
                sistemaProduto.exibirDados();
                index++;
            }
        }
    }

    public static void contarProdutos()
    {
        System.out.println("Total de produtos cadastrados: " + sistemaProdutos.size());
    }
}
