import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente();

        //Abrindo a conta
        System.out.println("CRIANDO CONTA:\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Digite o numero da conta: ");
        cliente.setConta(sc.nextInt());

        //Verificando se será feito um primeiro deposito
        int i;
        do
        {
            System.out.println("Será feito um deposito?\nDigite os números:\n1)Sim\n2)Nao");
            i = sc.nextInt();
        } while ((i != 1 && i != 2));

        if (i == 1)
        {
            System.out.println("Valor do deposito: ");
            cliente.setSaldo(sc.nextFloat());
        } else
        {
            cliente.setSaldo(0);
        }

        //Agora, faremos a opção do cliente somente olhar as informações da conta, sacar algum valor ou depositar
        System.out.println("\n\nCLIENTE ACESSANDO:\n");
        int j;
        do
        {
            System.out.println("\n\nOla!\nEscolha uma das opcoes:\n1)Informacoes de conta\n2)Sacar\n3)Depositar\n4)Sair");
            j = sc.nextInt();

            if (j == 1)
            {
                System.out.println("\nInformacoes de conta: ");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Conta: " + cliente.getConta());
                System.out.println("Saldo: " + cliente.getSaldo());
            }
            if (j == 2)
            {
                if (cliente.getSaldo() <= 0)
                {
                    System.out.println("Nao foi possivel realizar o saque.");
                }else
                {
                    System.out.println("\nValor do saque: ");
                    cliente.Sacar(sc.nextFloat());
                    System.out.println("Saque realizado com sucesso!\nSaldo atual: " + cliente.getSaldo());
                }
            }
            if (j == 3)
            {
                System.out.println("\nValor do deposito: ");
                cliente.Deposito(sc.nextFloat());
                System.out.println("Deposito realizado com sucesso!\nSaldo atual: " + cliente.getSaldo());
            }
            if (j == 4)
            {
                System.out.println("\nObrigada!");
                break;
            }
        } while (j != 4);

    }
}