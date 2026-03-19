public class atv1Cachorro extends atv1Animais
{
    private String raca;

    public atv1Cachorro(String nome, int idade, String raca)
    {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca()
    {
        return raca;
    }

    public void setRaca(String raca)
    {
        this.raca = raca;
    }

    @Override
    public void exibirDados()
    {
        System.out.println("=== DADOS DO CACHORRO ===\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Raça: " + getRaca());
    }
}
