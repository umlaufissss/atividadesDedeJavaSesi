public class FoneDeOuvido
{
    public String marca;
    public int volume;
    public boolean conectado;

    public void aumentarVolume()
    {
        System.out.println("Aumentando volume...");
        volume +=1;
    }

    public void conectar()
    {
        System.out.println("Conectando...");
        conectado = true;
    }

    public void desconectar()
    {
        System.out.println("Desconectando...");
        conectado = false;
    }
}
