public class PecaImportada extends Peca
{
    //Adicionando os atributos
    private float taxaImportacao;
    private float taxaFrete;

    // ---- CONSTRUTORES ----
    public PecaImportada(){
        super();
        taxaImportacao = 0.0F;
        taxaFrete = 0.0F;
    }

    public PecaImportada (String nome, float custo, float lucro, float taxaImportacao, float taxaFrete){
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    // --- GETTERS E SETTERS ---
    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaImportacao(float taxaImportacao){
        this.taxaImportacao = taxaImportacao;
    }

    public void setTaxaFrete(float taxaFrete){
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calcularPreco(){
        return super.calcularPreco() + taxaImportacao + taxaFrete;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Taxa de Importacao: " + taxaImportacao);
        System.out.println("Taxa de Frete: " + taxaFrete);
    }
}
