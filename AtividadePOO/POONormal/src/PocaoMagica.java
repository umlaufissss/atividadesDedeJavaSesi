public class PocaoMagica
{
    public String tipo;
    public int potencia;
    public int quantidade;

    public void usar()
    {
        System.out.println("Usando poção...");
        quantidade -=1;
    }

    public void recarregar()
    {
        System.out.println("Recarregando poção: ");
        quantidade +=1;
    }
}
