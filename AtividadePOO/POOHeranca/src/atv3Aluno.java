public class atv3Aluno extends atv3Pessoa
{
    private long matricula;
    private String curso;

    public atv3Aluno(String nome, String cpf, int idade, long matricula, String curso)
    {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public long getMatricula()
    {
        return matricula;
    }

    public void setMatricula(long matricula)
    {
        this.matricula = matricula;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    @Override
    public void exibirDados()
    {
        System.out.println("=== DADOS DO ALUNO ===\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Idade: " + getIdade() +
                "Matricula: " + getMatricula() +
                "Curso: " + getCurso());
    }
}
