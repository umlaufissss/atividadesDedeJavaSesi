public class Smartphone
{
    public String modelo;
    public float armazenamento;
    public boolean ligado;

    public void ligar()
    {
        System.out.println("Ligando celular...");
        ligado = true;
    }

    public void desligar()
    {
        System.out.println("Desligando celular...");
        ligado = false;
    }

    public void mostrarInfo()
    {
        System.out.println("Mostrando info...");
        System.out.println("MODELO: " + modelo);
        System.out.println("ARMAZENAMENTO: " + armazenamento);
        System.out.println("LIGADO: " + ligado);
    }
}
