import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Aluno aluno[] = new Aluno[100];
        int cont = 0; //O cont auxiliará para que possamos percorrer somente indices do vetores que foram instanciados
        int identificador;
        String nome;
        int idade;
        float peso;
        float altura;

        //Agora, farei um Menu;
        int x;
        do
        {
            System.out.println("\n\n--Menu:--\n1) Cadastrar Alunos;\n2) Listar Alunos(somente nomes)\n3) Relatório Geral (exibe todas as informações)\n4) Sair");
            x = sc.nextInt();

            if (x == 1)
            {
                System.out.println("\n\n--Cadastro de Aluno--\n");
                aluno[cont] = new Aluno();
                System.out.println("Identificador:\n");
                identificador = sc.nextInt();
                sc.nextLine();
                aluno[cont].setIdentificador(identificador);
                System.out.println("Nome:\n");
                nome = sc.nextLine();
                aluno[cont].setNome(nome);
                System.out.println("Idade:\n");
                idade = sc.nextInt();
                aluno[cont].setIdade(idade);
                System.out.println("Peso:\n");
                peso = sc.nextFloat();
                aluno[cont].setPeso(peso);
                System.out.println("Altura:\n");
                altura = sc.nextFloat();
                aluno[cont].setAltura(altura);
                cont ++;
                System.out.println("\nCadastro realizado com sucesso!\n");
            }

            if (x == 2)
            {
                System.out.println("\n\n--Lista de Alunos:\n");

                for (int i = 0; i < cont; i++)
                {
                    System.out.println(i + 1 +")" + aluno[i].getNome()+ "\n");
                }
            }

            if (x == 3)
            {
                System.out.println("\n\n--Relatótio Geral--\n");

                for (int i = 0; i < cont; i++)
                {
                    System.out.println("\n");
                    aluno[i].Exibir();
                }

            }

        } while (x != 4);
    }
}