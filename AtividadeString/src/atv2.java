public class atv2 extends Main
{
    public static void atividade2()
    {
        String usuarioAdmin = "DedeEDemais", usuarioUsuario;
        int senhaAdmin = 1234, senhaUsuario;

        System.out.println("Digite o seu usuário: ");
        usuarioUsuario = SC.nextLine();

        System.out.println("Digite a sua senha: ");
        senhaUsuario = SC.nextInt();
        SC.nextLine();

        if(usuarioUsuario.equalsIgnoreCase(usuarioAdmin) && senhaUsuario == senhaAdmin)
        {
            System.out.println("Acesso liberado");
        }
        else
        {
            System.out.println("Acesso negado");
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
