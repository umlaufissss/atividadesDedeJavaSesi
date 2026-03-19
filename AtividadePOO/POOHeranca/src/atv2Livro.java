public class atv2Livro extends atv2Produto
{
    private String autor;

    public atv2Livro(String nome, double preco, int quantidade, String autor)
    {
        super(nome, preco, quantidade);
        this.autor = autor;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    @Override
    public void exibirDados()
    {
        System.out.println("=== DADOS DO LIVRO ===\n" +
                "Nome: " + getNome() + "\n" +
                "Preço: R$" + getPreco() + "\n" +
                "Quantidade: " + getQuantidade() + "\n" +
                "Autor: " + getAutor());
    }
}
