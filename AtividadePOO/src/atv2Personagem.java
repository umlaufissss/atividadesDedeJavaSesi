public class atv2Personagem
{
    public String nome;
    public int nivel;
    public String classe;

    public void subirNivel()
    {
        nivel+=1;
        System.out.println("A personagem " + nome + " está subindo de nível");
    }

    public void mostrarStatus()
    {
        System.out.println("STATUS: ");
        System.out.println("NOME: " + nome);
        System.out.println("NÍVEL: " + nivel);
        System.out.println("CLASSE: " + classe);
    }
}
