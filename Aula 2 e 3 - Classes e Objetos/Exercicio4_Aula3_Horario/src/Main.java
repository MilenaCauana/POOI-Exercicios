public class Main
{
    public static void main(String[] args)
    {
        Horario h = new Horario();

        h.exibe();

        Horario h1 = new Horario(1,30,10);
        h1.exibe();
        System.out.println("Segundos: "+h1.calcularSegundos());

    }
}