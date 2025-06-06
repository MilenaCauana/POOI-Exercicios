public class Conta
{
    private String numero;
    protected String cliente;
    private double saldo;

    // -------- CONSTRUTORES ----------
    public Conta()
    {
        numero = "não definido";
        cliente = "não definido";
        saldo = 0;
    }

    public Conta (String numero, String cliente)
    {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
    }

    // -------- GETS E SETS ----------
    public String getNumero ()
    {
        return numero;
    }

    public String getCliente ()
    {
        return cliente;
    }

    public double getSaldo ()
    {
        return saldo;
    }

    public void setNumero (String numero)
    {
        this.numero = numero;
    }

    public void setCliente (String cliente)
    {
        this.cliente = cliente;
    }

    public void setSaldo (double saldo)
    {
        this.saldo = saldo;
    }

    // -------- MÉTODOS ----------
    public void depositar (double valor)
    {
        saldo = saldo + valor;
    }

    public void sacar (double valor)
    {
        if (saldo - valor >= 0)
        {
            saldo = saldo - valor;
        }
    }

    public void exibir()
    {
        System.out.println("\n==============================");
        System.out.println("Conta: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("================================");
    }
}
