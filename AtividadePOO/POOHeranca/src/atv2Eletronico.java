public class atv2Eletronico extends atv2Produto
{
    private int garantiaMeses;

    public atv2Eletronico(String nome, double preco, int quantidade, int garantiaMeses)
    {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses()
    {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses)
    {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void exibirDados()
    {
        System.out.println("=== DADOS DO ELETRONICO ===\n" +
                "Nome: " + getNome() + "\n" +
                "Preço: R$" + getPreco() + "\n" +
                "Quantidade: " + getQuantidade() + "\n" +
                "Tempo de garantia: " + getGarantiaMeses() + " meses");
    }
}
