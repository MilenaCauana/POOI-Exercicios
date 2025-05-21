public class Aluno {
    private int identificador;
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    //Construtores com e sem parâmetros
    public Aluno() {
        identificador = 0;
        nome = "";
        idade = 0;
        peso = 0;
        altura = 0;
    }

    public Aluno (int identificador, String nome, int idade, float peso, float altura) {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    //Getters e Setters
    public int getIdentificador() {
        return identificador;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public float getPeso(){
        return peso;
    }

    public float getAltura(){
        return altura;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setPeso (float peso){
        this.peso = peso;
    }

    public void setAltura (float altura){
        this.altura = altura;
    }

    //Agora, irei criar os métodos específicos para este problema
    public double calcularIMC(){
        return ((float) peso / Math.pow(altura, 2));
    }

    public void Exibir()
    {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularIMC());
    }

}