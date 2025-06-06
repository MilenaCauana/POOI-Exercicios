public class ContaEspecial extends Conta
{

    //Especializando, irei colocar aqui os atributos que são diferentes para a ContaEspecial
    private double limite;

    // -------- CONSTRUTOR COM PARÂMETROS ----------
    public ContaEspecial (String numero, String cliente)
    {
        /*setNumero(numero);
        this.cliente = cliente;
        setSaldo(0);*/
        //super.exibir(); //Com o super, posso acessar os métodos
       //super(); //O super assim, sem se referencias a um método e sem parâmetro chama o construtor Conta() sem parâmetro
        super(numero, cliente); //Aqui, estou chamando o construtor com parâmetros;
        limite = 100; //Colocando valor para aqueles atributos que são diferentes
    }

    // --- GET E SET ---
    public double getLimite()
    {
        return limite;
    }

    public void setLimite(double limite)
    {
        this.limite = limite;
    }
    // ---SOBRESCRVENDO OS MÉTODOS ---

    @Override
    public void sacar (double valor)
    {
        if (getSaldo() + limite - valor >= 0)
        {
            double saldo = getSaldo() - valor;
            setSaldo(saldo);
        }
    }

    @Override
    public void exibir()
    {
        System.out.println("\n==============================");
        System.out.println("Conta: " + getNumero());
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Limite: R$" + limite);
        System.out.println("================================");
    }
}
