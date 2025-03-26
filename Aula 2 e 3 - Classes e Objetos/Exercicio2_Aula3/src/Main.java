import java.util.Scanner;

//Agora, faremos um sistema de uma academia que recebe os dados do usuárop
public class Main
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno();

        //Leitura de dados do usuário
        System.out.println("LEITURA DO USUÁRIO:\n\n");
        Scanner sc = new Scanner(System.in); //Aqui, estamos criando um objeto Scanner que permite ler dados de entrada do usuário a partir do teclado

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println("Peso: ");
        float peso = sc.nextFloat();
        System.out.println("Altura: ");
        float altura = sc.nextFloat();

        //Agora, vamos passar os parâmetros para o meu objeto
        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.setPeso(peso);
        aluno1.setAltura(altura);

        //Agora, iremos conferir se meu objeto foi de fato acessado
        System.out.println("INFORMACAO DO ALUNO:\n");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Peso: " + aluno1.getPeso());
        System.out.println("Altura: " + aluno1.getAltura());

        if (aluno1.menorDeIdade())
        {
            System.out.println("Aluno menor do idade");
        }else
        {
            System.out.println("Aluno maior do idade");
        }

        System.out.println("IMC: \n" + aluno1.IMC());

    }
}