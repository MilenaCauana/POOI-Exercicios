public class Conta
{
    private int numero;
    private String titular;
    private double saldo;
    private double limite;

    //Fazendo os construtores
    public Conta()
    {
        numero = 0;
        titular = "";
        saldo = 0;
        limite = 0;
    }

    public Conta(int numero, String titular, double saldo, double limite)
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    //Agora, farei os getters e setters
    public int getNumero()
    {
        return numero;
    }

    public String getTitular()
    {
        return titular;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public double getLimite()
    {
        return limite;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setTitular (String titular)
    {
        this.titular = titular;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void setLimite(double limite)
    {
        this.limite = limite;
    }

    //Um método para exibir os valores dos atributos
    public void exibir()
    {
        System.out.println("\nTitular: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }

    //Agora, farei os métodos do exercício
    public void depositar(double valor)
    {
        saldo += valor;
    }

    public boolean saque(double valor)
    {
        if (saldo + valor >= limite)
        {
            System.out.println("Limite excedido!");
            return false;
        }
        saldo -= valor;
        return true;
    }

    //Para além do exercício, farei um método que calcula o limite de acordo com o salario do cliente, que será fornecido
    public void calculoLimite(double salario){
        //Na maioria dos bancos, o limite é 30% do salário
        limite = 0.3 * salario;
    }

}
