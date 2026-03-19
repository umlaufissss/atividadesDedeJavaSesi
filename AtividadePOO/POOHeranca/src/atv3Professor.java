public class atv3Professor extends atv3Pessoa
{
    private String disciplina;
    private double salario;

    public atv3Professor(String nome, String cpf, int idade, String disciplina, double salario)
    {
        super(nome, cpf, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina()
    {
        return disciplina;
    }

    public void setDisciplina(String disciplina)
    {
        this.disciplina = disciplina;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    @Override
    public void exibirDados()
    {
        System.out.println("=== DADOS DO PROFESSOR ===\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Disciplina: " + getDisciplina() + "\n" +
                "Salário: " + getSalario());
    }
}
