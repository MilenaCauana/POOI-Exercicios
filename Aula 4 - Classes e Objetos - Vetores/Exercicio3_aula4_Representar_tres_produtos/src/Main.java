import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){
        //Primeiro, criarei um ponteiro para um vetor de cada classe
        Estadual estadual[];
        Nacional nacional[];
        Importado importado[];

        //Agora, criaremos o vetor. com ponteiros para cada classe
        estadual = new Estadual[100];
        nacional = new Nacional[100];
        importado = new Importado[100];

        int contEst = 0;
        int contNac = 0;
        int contImp = 0;

        int x;

        Scanner sc = new Scanner(System.in);
        //Agora, faremos os menus e implementaremos cada opção
        do{
            System.out.println("MENU: ");
            System.out.println("1- Cadastrar Produto Estadual;");
            System.out.println("2- Cadastrar Produto Nacional;");
            System.out.println("3- Cadastrar Produto Importado;");
            System.out.println("4- Exibir Produtos Estaduais;");
            System.out.println("5- Exibir Produtos Nacionais;");
            System.out.println("6- Exibir Produtos Importados;");
            System.out.println("7- Exibir Todos Produtos;");
            System.out.println("9- SAIR.");

            x = sc.nextInt();
            sc.nextLine();

            if (x == 1)
            {
                System.out.println("\n\n--Produto Estadual--");

                estadual[contEst] = new Estadual();

                System.out.println("Produto: ");
                String descricao = sc.nextLine();
                estadual[contEst].setDescricao(descricao);

                System.out.println("Valor: ");
                double valor = sc.nextInt();
                sc.nextLine();
                estadual[contEst].setValor(valor);

                System.out.println("--Produto " + estadual[contEst].getDescricao() + "--");
                estadual[contEst].exibir();

                contEst ++;
            }

            if (x == 2)
            {
                System.out.println("\n\n--Produto Nacional--");

                nacional[contNac] = new Nacional();

                System.out.println("Produto: ");
                String descricao = sc.nextLine();
                nacional[contNac].setDescricao(descricao);

                System.out.println("Valor: ");
                double valor = sc.nextInt();
                sc.nextLine();
                nacional[contNac].setValor(valor);

                nacional[contNac].exibir();

                contNac ++;
            }

            if (x == 3)
            {
                System.out.println("\n\n--Produto Importado--");

                importado[contImp] = new Importado();

                System.out.println("Produto: ");
                String descricao = sc.nextLine();
                importado[contImp].setDescricao(descricao);

                System.out.println("Valor: ");
                double valor = sc.nextInt();
                sc.nextLine();
                importado[contImp].setValor(valor);

                importado[contImp].exibir();

                contImp ++;
            }

            if (x == 4)
            {
                System.out.println("\n\n--Produtos Estaduais--");

                for (int i = 0; i < contEst; i++){
                    estadual[contEst].exibir();
                }
            }

            if (x == 5)
            {
                System.out.println("\n\n--Produtos Nacionais--");

                for (int i = 0; i < contNac; i++){
                    nacional[contNac].exibir();
                }
            }

            if (x == 6)
            {
                System.out.println("\n\n--Produtos Importados--");

                for (int i = 0; i < contImp; i++){
                    importado[contImp].exibir();
                }
            }

            if (x == 7)
            {
                System.out.println("\n\n---TODOS OS PRODUTOS---");

                System.out.println("\n\n--Produtos Estaduais--");

                for (int i = 0; i < contEst; i++){
                    estadual[i].exibir();
                }

                System.out.println("\n\n--Produtos Nacionais--");

                for (int i = 0; i < contNac; i++){
                    nacional[i].exibir();
                }

                System.out.println("\n\n--Produtos Importados--");

                for (int i = 0; i < contImp; i++){
                    importado[i].exibir();
                }

            }

        }while (x != 9);

        System.out.println("Tchau!\nMuito obrigada!");
    }
}