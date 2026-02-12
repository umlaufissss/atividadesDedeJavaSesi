public class atv4 extends Main
{
    //COMANDO:Pergunte ao usuário um valor em reais e converter para dólares (use uma
    //taxa fixa, como 5 reais = 1 dólar).

    public static void atividade4()
    {
        float nDolar, nReal;

        System.out.println("Digite um valor em reais:\nR$");
        nReal = SC.nextFloat();
        SC.nextLine();

        nDolar = nReal * 0.19f;

        System.out.println("Seu valor em dolar é: US$" + nDolar);
    }
}
