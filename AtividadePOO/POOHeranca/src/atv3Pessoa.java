public class atv3Pessoa
{
    private String nome;
    private String cpf;
    private int idade;

    public atv3Pessoa(String nome, String cpf, int idade)
    {
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
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
        System.out.println("=== DADOS DA PESSOA ===\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Idade: " + getIdade());
    }
}
