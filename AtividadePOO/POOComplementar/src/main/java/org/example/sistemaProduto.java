package org.example;

public class sistemaProduto
{
    private String nome;
    private double preco;
    private int quantidade;

    public sistemaProduto(String nome, double preco, int quantidade)
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public void exibirDados()
    {
        System.out.println("DADOS----------");
        System.out.println("NOME: " + getNome());
        System.out.println("PREÇO: " + getPreco());
        System.out.println("QUANTIDADE: " + getQuantidade());
    }


}
