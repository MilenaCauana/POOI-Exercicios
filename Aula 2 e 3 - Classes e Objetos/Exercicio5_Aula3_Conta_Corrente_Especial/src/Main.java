import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Conta conta1 = new Conta();

        System.out.println("Titular: " + conta1.getTitular() + "\nSaldo: " + conta1.getSaldo() + "\nLimite: " + conta1.getLimite());

        //Abrindo conta 1
        Scanner sc = new Scanner(System.in);
        System.out.println("ABRINDO CONTA:\n");
        System.out.println("Nome do Titular: ");
        conta1.setTitular(sc.nextLine());

        int i;
        do
        {
            System.out.println("Sera feito um primeiro deposito?\n1)Sim\n2)Nao");
            i = sc.nextInt();

            if (i == 1)
            {
                System.out.println("Valor do deposito: ");
                conta1.setSaldo(sc.nextDouble());
                System.out.println("Deposito realizado!Conta aberta com sucesso!\nInformacoes da conta:\nTitular: " + conta1.getTitular() + "\nLimite: " + conta1.getLimite() + "\nSaldo: " + conta1.getSaldo());
            }
            if (i == 2)
            {
                System.out.println("Conta aberta com sucesso!\nInformacoes da conta:\nTitular: " + conta1.getTitular() + "\nLimite: " + conta1.getLimite() + "\nSaldo: " + conta1.getSaldo());
            }
        } while (i != 1 && i != 2);

        System.out.println("\n\nACESSO DO CLIENTE: ");
        do
        {
            System.out.println("\n\nEscolha uma opcao: \n1)Informacoes da conta\n2)Saque\n3)Deposito\n4)Sair");
            i = sc.nextInt();
            if (i == 1)
            {
                System.out.println("Informacoes da conta:\nTitular: " + conta1.getTitular() + "\nLimite: " + conta1.getLimite() + "\nSaldo: " + conta1.getSaldo());
            }
            if (i == 2)
            {
                System.out.println("Valor do saque: ");
                if (conta1.Saque(sc.nextDouble()))
                {
                    System.out.println("Saque realizado com sucesso!!\nSaldo: " + conta1.getSaldo());
                } else
                {
                    System.out.println("Saque nao realizado, limite atingido.");
                }
            }
            if (i == 3)
            {
                System.out.println("Valor do Deposito: ");
                conta1.Deposito(sc.nextDouble());
                System.out.println("Deposito feito com sucesso!\nSaldo: " + conta1.getSaldo());
            }
        } while (i != 4);

        System.out.println("\nObrigado.");
    }
}