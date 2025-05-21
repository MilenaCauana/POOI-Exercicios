import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Conta conta[];
        conta = new Conta[100];


        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int x, i, cont = 0;

        //Criando Menu
        do {
            System.out.println("\n\nMENU:");
            System.out.println("1)Cadastrar Nova Conta;");
            System.out.println("2)Saque;");
            System.out.println("3)Depósito;");
            System.out.println("4)Listar Contas (posição do vetor e nome dos clientes,)");
            System.out.println("5)Relatório Geral (todas as contas);");
            System.out.println("6)Relatório de Contas cujo saldo está abaixo de zero;");
            System.out.println("7)Relatório da Conta de um determinado cliente;");
            System.out.println("9)Sair");
            x = sc.nextInt();
            sc.nextLine();

            if (x == 1) {
                conta[cont] = new Conta();

                System.out.println("--Cadastro de Conta--");
                System.out.println("Nome: ");
                String titular = sc.nextLine();
                conta[cont].setTitular(titular);
                System.out.println("Salario: ");
                conta[cont].calculoLimite(sc.nextDouble());
                sc.nextLine();

                //Gerando o numero da conta de forma aleatória;
                int numero = random.nextInt(200);
                conta[cont].setNumero(numero);

                //Por fim, o cliente poderá ver suas informações e se ela está correta
                conta[cont].exibir();

                cont++;

            }

            if (x == 2) {
                System.out.println("--Saque--");

                //Primeiro, irei buscar qual a conta em que será feito o saque
                System.out.println("Numero conta");
                int numero = sc.nextInt();

                for (i = 0; i < cont; i++) {
                    if (conta[i].getNumero() == numero) {
                        break;
                    }
                }

                if (i == cont) {
                    System.out.println("Conta nao encontrada!");
                } else {
                    System.out.println("Valor: ");
                    double valor = sc.nextInt();
                    boolean saque = conta[i].saque(valor);
                    if (saque) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo Insuficiente.");
                    }

                    System.out.println("Saldo atual: " + conta[i].getSaldo());
                }
            }

            if (x == 3) {
                System.out.println("--Depósito--");

                //Primeiro, irei buscar qual a conta em que será feito o saque
                System.out.println("Numero conta");
                int numero = sc.nextInt();

                for (i = 0; i < cont; i++) {
                    if (conta[i].getNumero() == numero) {
                        break;
                    }
                }

                if (i == cont) {
                    System.out.println("Conta nao encontrada!");
                } else {
                    System.out.println("Valor: ");
                    double valor = sc.nextInt();
                    conta[i].depositar(valor);

                    System.out.println("Saldo atual: " + conta[i].getSaldo());
                }

            }


            if (x == 4){
                System.out.println("--Contas--");

                for (i = 0; i < cont; i++){
                    System.out.println(i + ")" + conta[i].getTitular());
                }
            }

            if (x == 5){
                System.out.println("--Relatório Geral--");

                for (i = 0; i < cont; i++){
                    conta[i].exibir();
                }
            }

            if (x == 6){
                System.out.println("--Saldos abaixo de zero--");

                for (i = 0; i < cont; i++){
                    if (conta[i].getSaldo() < 0){
                        conta[i].exibir();
                    }
                }
            }

            if (x == 7){
                System.out.println("Numero conta");
                int numero = sc.nextInt();

                for (i = 0; i < cont; i++) {
                    if (conta[i].getNumero() == numero) {
                        break;
                    }
                }

                if (i == cont) {
                    System.out.println("Conta nao encontrada!");
                } else {
                    System.out.println("Relatorio Conta:");
                    conta[i].exibir();
                }
            }

        }while (x != 9);
    }

}