public class Horario
{
    private int hora;
    private int minuto;
    private int segundo;

    public Horario()
    {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo)
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Getters e Setters
    public int getHora()
    {
        return hora;
    }

    public void setHora(int hora)
    {
        this.hora = hora;
    }

    public int getMinuto()
    {
        return minuto;
    }

    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    public int getSegundo()
    {
        return segundo;
    }

    public void setSegundo(int segundo)
    {
        this.segundo = segundo;
    }

    //Agora, iremos fazer um método para exibir o horário
    public void exibe()
    {
        String h = Integer.toString(hora);
        String m = Integer.toString(minuto);
        String s = Integer.toString(segundo);

        if (hora < 10)
        {
            h = "0"+h;
        }
        if (minuto < 10)
        {
            m = "0"+m;
        }
        if(segundo < 10)
        {
            s = "0"+s;
        }

        System.out.println(h + ":" + m + ":" + s);
    }

    public int calcularSegundos()
    {
        int seg = 3600 * hora + 60 * minuto + segundo;
        return seg;
    }
}

