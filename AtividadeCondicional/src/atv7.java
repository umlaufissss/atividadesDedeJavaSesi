public class atv7 extends Main
{
    //COMANDO: Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo
    //feminino e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso
    //contrário, imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.)

    public static void atividade7()
    {
        String nome, saborSexo;
        Character sexo;
        int idade;

        System.out.println("Digite o seu nome:");
        nome = SC.nextLine();

        System.out.println("Digite o seu sexo: [F/M]");
        sexo = SC.next().charAt(0);
        saborSexo = sexo.toString();

        System.out.println("Digite a sua idade: ");
        idade = SC.nextInt();
        SC.nextLine();

        if(idade < 25)
        {
            if (saborSexo.toUpperCase().equals("F"))
            {
                System.out.println("ACEITA");
            }
        }
        else
        {
            System.out.println("NÃO ACEITA");
        }

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
        }
        inicio();
    }
}
