public class Main
{
    public static void main(String[] args){
        //Irei criar dois objetos, um de cada para teste
        Peca peca = new Peca("Motor", 100, 10);
        PecaImportada pecaImportada = new PecaImportada("Chave", 20, 5, 4, 10);

        System.out.println("---- Peca ----");
        peca.exibir();

        System.out.println("---- Peca Importada ----");
        pecaImportada.exibir();

    }
}