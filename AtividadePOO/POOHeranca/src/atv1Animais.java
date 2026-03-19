public class atv1Animais
{
    private String nome;
    private int idade;

    public atv1Animais(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void exibirDados()
    {
        System.out.println("=== DADOS DO ANIMAL ===\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n");
    }
}
