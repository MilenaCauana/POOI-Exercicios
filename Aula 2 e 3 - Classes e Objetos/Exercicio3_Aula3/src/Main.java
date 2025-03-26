import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente();

        //Abrindo a conta
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Digite o numero da conta: ");
        cliente.setConta(sc.nextInt());

        //Verificando se será feito um primeiro deposito
        System.out.println("Será feito um deposito?\nDigite os números:\n1)Sim\n2)Nao");
        int i = sc.nextInt();
        
    }
}