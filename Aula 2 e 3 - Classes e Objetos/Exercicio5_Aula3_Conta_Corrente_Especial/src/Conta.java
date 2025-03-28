public class Conta {
    private String titular;
    private double saldo;
    private double limite;

    //Construtores com e sem parâmetros
    public Conta() {
        titular = "Nome não definido.";
        saldo = 0;
        limite = 500;
    }

    public Conta(String titular, double saldo, double limite) {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    //Getters e Setters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Métodos para saque e depósito (no saque, a conta pode ficar negativa ate o valor do limite
    public void Deposito(double valor)
    {
        saldo += valor;
    }

    public boolean Saque(double valor)
    {
        if (saldo - valor >= -limite) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}