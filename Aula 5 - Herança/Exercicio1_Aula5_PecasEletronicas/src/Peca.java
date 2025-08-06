public class Peca
{
    private String nome;
    private float custo;
    private float lucro;

    // --------- CONSTRUTORES ---------
    public Peca(){
        nome = "Nome nao foi inserido.";
        custo = 0.0F;
        lucro = 0.0F;
    }

    public Peca(String nome, float custo, float lucro){
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    // -------- GETTERS E SETTERS ------
    public String getNome(){
        return nome;
    }

    public float getCusto(){
        return custo;
    }

    public float getLucro(){
        return lucro;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setCusto (float custo){
        this.custo = custo;
    }

    public void setLucro (float lucro){
        this.lucro = lucro;
    }

    //Calculando o preço --> ele só será utilizado pela própria classe para calcular o preço
    public float calcularPreco(){
        return custo + lucro;
    }

    //Exibindo atributos
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Lucro: " + lucro);
        System.out.println("Preco: " + calcularPreco());
    }
}