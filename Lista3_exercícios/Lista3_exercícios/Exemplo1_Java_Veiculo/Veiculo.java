public class Veiculo
{
    private String marca;
    private String modelo;
    private int ano;
    private boolean disponivel = true;

    void setAno(int ano){ //Por convenção, para distinguir o que é atributo e o que é global, usamos o this para o global
        if (ano >= 2000)
            this.ano = ano;
    }
    
    void setMarca(String marca){
        this.marca = marca;
    }
    
    void setModelo(String modelo){
        this.modelo = modelo;
    }

    void emprestar()
    {
        disponivel = false;
    }

    void devolver()
    {
    disponivel = true;
    }

    boolean estaDisponivel()
    {
        return disponivel;
    }
    
    String getMarca(){
        return marca;
    }
    
    String getModelo(){
        return modelo;
    }
    
    int getAno(){
        return ano;
    }
}
