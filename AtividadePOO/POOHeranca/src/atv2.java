public class atv2 extends Main
{
    //TESTE PRODUTOS
    public static void atividade2()
    {
        String nome, autor;
        int quantidade, garantiaMeses, escolha, opcao = 0;
        double preco;
        boolean cadastro = false;

        do
        {
            System.out.println("Por favor, escolha a opção de produto que você quer cadastrar: ");
            System.out.println("[1] - Livro");
            System.out.println("[2] - Eletrônico");
            escolha = SC.nextInt();
            SC.nextLine();

            System.out.println("Por favor, digite os dados do seu produto:");

            System.out.println("Nome: ");
            nome = SC.nextLine();

            System.out.println("Preço: ");
            preco = SC.nextDouble();
            SC.nextLine();

            System.out.println("Quantidade: ");
            quantidade = SC.nextInt();
            SC.nextLine();

            switch (escolha)
            {
                case 1:
                {

                    System.out.println("Autor: ");
                    autor = SC.nextLine();

                    atv2Livro livro = new atv2Livro(nome, preco, quantidade, autor);

                    livro.exibirDados();
                    cadastro = true;
                    break;
                }
                case 2:
                {

                    System.out.println("Tempo de garantia em meses: ");
                    garantiaMeses = SC.nextInt();
                    SC.nextLine();

                    atv2Eletronico eletronico = new atv2Eletronico(nome, preco, quantidade, garantiaMeses);

                    eletronico.exibirDados();
                    cadastro = true;
                    break;
                }

                default:
                {
                    System.out.println("Opção inválida: ");
                    break;
                }
            }

            if (cadastro)
            {
                System.out.println("Você gostaria de cadastrar o outro tipo de produto?");
                System.out.println("[1] - SIM");
                System.out.println("[0] - NÃO");
                opcao = SC.nextInt();
                SC.nextLine();
            }
        }
        while (opcao != 0);

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
