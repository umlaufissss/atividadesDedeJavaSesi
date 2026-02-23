public class atv1 extends Main
{
    public static void atividade1()
    {
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = SC.nextLine().trim();

        if(nomeCompleto.length()>=5 && nomeCompleto.contains(" "))
        {
            System.out.println(nomeCompleto.toUpperCase());
        }
        else
        {
            System.out.println("ERRO: A String não tem os requisitos mínimos: \n MIN 5 num & SPACE entre NOME e SOBRENOME");
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
