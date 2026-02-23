public class atv3 extends Main
{
    public static void atividade3()
    {
        boolean ehValido = false;
        int arroba = 0;

        System.out.println("Digite o seu e-mail");
        String emailValido = SC.nextLine();

        if(emailValido.contains("@") && emailValido.contains("."))
        {
            if(!emailValido.startsWith("@"))
            {
                ehValido = true;
                arroba = emailValido.indexOf("@");
            }
        }

        if(ehValido)
        {
            System.out.println(emailValido.substring(0, arroba - 1));
            System.out.println(emailValido.substring(arroba));
        }
        else
        {
            System.out.println("E-mail inválido!");
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
