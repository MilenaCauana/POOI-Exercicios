public class Estadual{
    private String descricao;
    private double valor;
    private float imposto = 0.1f; //Como o imposto é fixo, já o deixarei aqui

    //Construtores, criarei somente um construtor sem parâmetro
    public Estadual(){
        descricao = "";
        valor = 0.0;
    }

    //Gettrs e Setters
    public String getDescricao (){
        return descricao;
    }

    public double getValor (){
        return valor;
    }

    public float getImposto (){
        return imposto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    //Agora, farei um método que calcule o valor final do produto
    public double valorFinal(){
        return valor + valor * imposto;
    }

    //Método que exibe todas as informações do produto
    public void exibir(){
        System.out.println("\nProduto: " + descricao);
        System.out.println("Valor original: " + valor);
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor final: " + valorFinal());
    }
}