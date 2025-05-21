public class Nacional{
    private String descricaoNac;
    private double valorNac;
    private float impostoNac = 0.1f; //Como o impostoNac é fixo, já o deixarei aqui
    private float taxaNac = 0.05f;

    //Construtores, criarei somente um construtor sem parâmetro
    public Nacional(){
        descricaoNac = "";
        valorNac = 0.0;
    }

    //Gettrs e Setters
    public String getDescricao (){
        return descricaoNac;
    }

    public double getValor (){
        return valorNac;
    }

    public float getImposto (){
        return impostoNac;
    }

    public float getTaxa(){
        return taxaNac;
    }

    public void setDescricao (String descricaoNac){
        this.descricaoNac = descricaoNac;
    }

    public void setValor(double valorNac){
        this.valorNac = valorNac;
    }

    public void setImposto (float impostoNac){
        this.valorNac = valorNac;
    }

    public void setTaxa(float taxaNac){
        this.taxaNac = taxaNac;
    }

    //Agora, farei um método que calcule o valorNac final do produto
    public double valorNacFinal(){
        return valorNac + valorNac * impostoNac + valorNac * taxaNac;
    }

    //Método que exibe todas as informações do produto
    public void exibir(){
        System.out.println("\nProduto: " + descricaoNac);
        System.out.println("Valor original: " + valorNac);
        System.out.println("Imposto: " + impostoNac);
        System.out.println("Taxa: " + taxaNac);
        System.out.println("Valor final: " + valorNacFinal());
    }
}