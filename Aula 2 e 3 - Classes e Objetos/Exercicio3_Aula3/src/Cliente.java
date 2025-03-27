public class Cliente
{
    private String nome;
    private int conta;
    private float saldo;

    public String getNome()
    {
        return nome;
    }

    public int getConta()
    {
        return conta;
    }

    public float getSaldo()
    {
        return saldo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setConta(int conta)
    {
        this.conta = conta;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    //Agora, faremos os métodos para o cliente sacar ou depositar seu dinheiro
    public void Deposito(float valor)
    {
        this.saldo += valor;
    }

    public void Sacar(float valor)
    {
        saldo = saldo - valor;
    }

}