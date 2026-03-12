package org.example;

public class cadastroAluno
{
    private String nome;
    private double nota1;
    private double nota2;

    public cadastroAluno(String nome, double nota1, double nota2)
    {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getNota1()
    {
        return nota1;
    }

    public void setNota1(double nota1)
    {
        this.nota1 = nota1;
    }

    public double getNota2()
    {
        return nota2;
    }

    public void setNota2(double nota2)
    {
        this.nota2 = nota2;
    }

    public double calcularMedia()
    {
        return (getNota1()+getNota2())/2;
    }

    public String obterSituacao()
    {
        if(calcularMedia() >=7)
        {
            return "APROVADO";
        }
        else
        {
            return "REPROVADO";
        }
    }

    public void exibirDados()
    {
        System.out.println("NOME: " + getNome());
        System.out.println("NOTA 1: " + getNota1());
        System.out.println("NOTA 2: " + getNota2());
        System.out.println("MÉDIA: " + calcularMedia());
        System.out.println("SITUAÇÃO: " + obterSituacao());
    }
}
