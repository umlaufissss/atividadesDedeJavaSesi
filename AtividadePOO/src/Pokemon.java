public class Pokemon
{
    public String nome;
    public String tipo;
    public int nivel;

    public void atacar()
    {
        System.out.println(nome + " está atacando...");
    }

    public void evoluir()
    {
        nivel+=1;
        System.out.println("Parabéns! Seu " + nome + " evoluiu para o nível " + nivel);
    }

    public void mostrarStatus()
    {
        System.out.println("MOSTRANDO STATUS: ");
        System.out.println("NOME: " + nome);
        System.out.println("NÍVEL: lvl" + nivel);
        System.out.println("TIPO: " + tipo);
    }
}
