public class atv1 extends Main
{
    //TESTE CACHORRO

    public static void atividade1()
    {
        String nome, raca;
        int idade;

        System.out.println("Por favor, digite os dados do seu cachorro: ");

        System.out.println("Nome: ");
        nome = SC.nextLine();

        System.out.println("Idade: ");
        idade = SC.nextInt();
        SC.nextLine();

        System.out.println("Raça: ");
        raca = SC.nextLine();

        atv1Cachorro cachorro = new atv1Cachorro(nome, idade, raca);

        cachorro.exibirDados();

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
