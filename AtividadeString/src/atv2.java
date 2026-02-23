public class atv2 extends Main
{

    //COMANDO : Desenvolva um sistema de login que solicite usuário e senha, valide o usuário
    //ignorando maiúsculas e minúsculas com equalsIgnoreCase(), valide a senha com
    //equals() exigindo no mínimo 6 caracteres, e exiba “Acesso liberado” ou “Acesso
    //negado”.

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
