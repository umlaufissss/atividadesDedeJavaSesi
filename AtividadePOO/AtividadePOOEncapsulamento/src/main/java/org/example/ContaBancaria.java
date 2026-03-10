package org.example;

public class ContaBancaria
{
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor)
    {
        System.out.println("Adicionando a conta...");
        setSaldo(getSaldo()+valor);
    }

    public boolean sacar (double valor)
    {
        if(getSaldo() - valor <0)
        {
            System.out.println("ERRO! O SALDO NÃO PODE ESTAR NEGATIVO");
            return false;
        }
        else
        {
            System.out.println("Sacando da conta...");
            setSaldo(getSaldo()-valor);
            return true;
        }
    }

    public void mostrarSaldo()
    {
        System.out.println("Olá, " + getTitular() + "! \nSeu saldo é: R$" + getSaldo());
    }
}
