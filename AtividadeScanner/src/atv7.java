public class atv7 extends Main
{
    //COMANDO: Pergunte ao usuário o nome de um produto e seu preço. Exiba uma
    //mensagem com o nome do produto e seu preço.

    public static void atividade7()
    {
        String nome;
        float preco;

        System.out.println("BEM-VINDO AO MERCADO...\n");

        System.out.println("Digite o nome do seu produto: ");
        nome = SC.nextLine();

        System.out.println("Digite o preço do seu produto: ");
        preco = SC.nextFloat();

        System.out.println("O seu produto é: " + nome + " R$" + preco + "\n");

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
