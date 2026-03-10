package org.example;

public class Carro
{
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(String modelo, int ano, double velocidade) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(double valor)
    {
        System.out.println("Acelerando...");
        setVelocidade(getVelocidade()+valor);
    }

    public boolean freiar(double valor)
    {
        if(getVelocidade() - valor <0)
        {
            System.out.println("ERRO! O Carro já está parado a esse ponto");
            setVelocidade(0);
            return false;
        }
        else
        {
            System.out.println("Freiando...");
            setVelocidade(getVelocidade() - valor);
            return true;
        }
    }

    public void mostrarVelocidade()
    {
        System.out.println("VELODIDADE = " + getVelocidade() + "Km/H");
    }
}
