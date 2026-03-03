public class atv4 extends Main
{
    public static void atividade4()
    {
        Drone drone = new Drone();
        drone.modelo = "Pombo";
        drone.voando = true;
        drone.bateria = 100;

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Decolar || [2] - Pousar || [3] - Mostrar status");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            drone.decolar();
        }
        else if(escolha == 2)
        {
            drone.pousar();
        }
        else if(escolha == 3)
        {
            drone.mostrarStatus();
        }
        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade4();
        }

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        inicio();
    }
}
