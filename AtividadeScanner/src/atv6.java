public class atv6 extends Main
{
    //COMANDO: Pergunte ao usuário a largura e a altura de um retângulo e calcule a área,
    //exibindo o resultado.

    public static void atividade6()
    {
        float altura, largura, area;

        System.out.println("Olá! Vamos montar um retângulo...");

        System.out.println("Por favor, insira a altura: ");
        altura = SC.nextFloat();

        System.out.println("Agora, insira a largura: ");
        largura = SC.nextFloat();

        area = altura *largura;

        System.out.println("A área de seu retângulo é: " + area + "\n");

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
