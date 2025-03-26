public class Aluno
{
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    //Agora, faremos os métodos Set e Get
    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public float getPeso()
    {
        return peso;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    //Agora, criaremos os métodos que o exercício pede
    public boolean menorDeIdade()
    {
        return this.idade < 18;
    }

    public float IMC()
    {
        return peso/(altura*altura);
    }

}