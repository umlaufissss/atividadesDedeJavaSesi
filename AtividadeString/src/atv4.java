public class atv4 extends Main
{
    public static void atividade4()
    {
        int vogal = 0;

        System.out.println("Digite uma palavra legal");
        String palavraLegal = SC.nextLine().trim();
        int tamanho = palavraLegal.length() -1;

        System.out.println("Primeira letra: " + palavraLegal.charAt(0));
        System.out.println("Última letra: " + palavraLegal.charAt(tamanho));

        for(char caracter : palavraLegal.toCharArray())
        {
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
            {
                vogal ++;
            }
        }

        System.out.println("Você tem " + vogal + " vogal(is) em sua palavra legal!");

        System.out.print("Sua palavra ao contrário: ");
        for(int i = tamanho; i>=0; i--)
        {
            System.out.print(palavraLegal.charAt(i));
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
