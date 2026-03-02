public class Carro
{
    public String marca;
    public String cor;
    public int velocidadeAtual;

    public void acelerar()
    {
        System.out.println("Acelerando... Vroom Vroom");
        velocidadeAtual +=1;
    }

    public void freiar()
    {
        System.out.println("Freiando... Vroom Vroom");
        velocidadeAtual -=1;
    }

    public void mostrarVelocidade()
    {
        System.out.println("Mostrando velocidade: ");
        System.out.println("VELOCIDADE ATUAL: " + velocidadeAtual);
    }
}
