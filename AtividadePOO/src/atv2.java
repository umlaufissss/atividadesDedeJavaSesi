public class atv2 extends Main
{
    public static void atividade2()
    {
        Personagem personagem = new Personagem();
        personagem.nome = "Daniel Erthal Dapper";
        personagem.nivel = 0;
        personagem.classe = "Animal Programador de Front-End";

        System.out.println("Digite o que você quer fazer: ");
        System.out.println("[1] - Mostrar Status || [2] - Subir de nível ");
        int escolha = SC.nextInt();

        if(escolha == 1)
        {
            personagem.mostrarStatus();
        }
        else if(escolha == 2)
        {
            personagem.subirNivel();
        }

        else
        {
            System.out.println("OPÇÃO INVÁLIDA");
            atividade2();
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
