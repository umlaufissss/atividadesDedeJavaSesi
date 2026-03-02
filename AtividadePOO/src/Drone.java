public class Drone
{
    public String modelo;
    public int bateria;
    public boolean voando;

    public void decolar()
    {
        System.out.println("Drone decolando...");
        voando = true;
    }

    public void pousar()
    {
        System.out.println("Drone pousando...");
        voando = false;
    }

    public void mostrarStatus()
    {
        System.out.println("STATUS:");
        System.out.println("MODELO: " + modelo);
        System.out.println("BATERIA: " + bateria + "%");
        System.out.println("VOANDO: " + voando);
    }
}
