public class atv8 extends Main
{
    public static void atividade8()
    {
        Pokemon pokemon = new Pokemon();
        pokemon.nome = "Zorua";
        pokemon.tipo = "Noturno";
        pokemon.nivel = 5;

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Atacar || [2] - Evoluir || [3] - Mostrar status");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            pokemon.atacar();
        }
        else if(escolha == 2)
        {
            pokemon.evoluir();
        }
        else if(escolha == 3)
        {
            pokemon.mostrarStatus();
        }
        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade8();
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
