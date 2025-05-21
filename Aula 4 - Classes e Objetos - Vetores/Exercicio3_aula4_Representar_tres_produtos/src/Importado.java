public class Importado{
    private String descricaoImp;
    private double valorImp;
    private float impostoImp = 0.1f; //Como o impostoImp é fixo, já o deixarei aqui
    private float taxa = 0.05f;
    private float taxaImportacao = 0.05f;

    //Construtores, criarei somente um construtor sem parâmetro
    public Importado(){
        descricaoImp = "";
        valorImp = 0.0;
    }

    //Gettrs e Setters
    public String getDescricao (){
        return descricaoImp;
    }

    public double getValor (){
        return valorImp;
    }

    public float getImposto (){
        return impostoImp;
    }

    public float getTaxa(){
        return taxa;
    }

    public float getTaxaImportacao(){
        return taxaImportacao;
    }

    public void setDescricao (String descricaoImp){
        this.descricaoImp = descricaoImp;
    }

    public void setValor(double valorImp){
        this.valorImp = valorImp;
    }

    public void setImposto (float impostoImp){
        this.valorImp = valorImp;
    }

    public void setTaxa(float taxa){
        this.taxa = taxa;
    }

    public void setTaxaImportacao(float taxaImportacao){
        this.taxaImportacao = taxaImportacao;
    }

    //Agora, farei um método que calcule o valorImp final do produto
    public double valorImpFinal(){
        return valorImp + valorImp * impostoImp + valorImp * taxa + valorImp * taxaImportacao;
    }

    //Método que exibe todas as informações do produto
    public void exibir(){
        System.out.println("\nProduto: " + descricaoImp);
        System.out.println("Valor original: " + valorImp);
        System.out.println("Imposto: " + impostoImp);
        System.out.println("Taxa: " + taxa);
        System.out.println("Taxa Imporação: " + taxaImportacao);
        System.out.println("Valor final: " + valorImpFinal());
    }
}