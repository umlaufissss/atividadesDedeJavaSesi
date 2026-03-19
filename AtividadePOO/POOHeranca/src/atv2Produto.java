public class atv2Produto
{
    private String nome;
    private double preco;
    private int quantidade;

    public atv2Produto(String nome, double preco, int quantidade)
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

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public void exibirDados()
    {
        System.out.println("=== DADOS DO PRODUTO ===\n" +
                "Nome: " + getNome() + "\n" +
                "Preço: R$" + getPreco() + "\n" +
                "Quantidade: " + getQuantidade());
    }
}
