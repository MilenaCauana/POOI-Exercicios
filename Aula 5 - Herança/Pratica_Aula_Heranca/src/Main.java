import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Conta c = new Conta("123456", "Cliente");
        c.exibir();
        c.depositar(20);
        c.exibir();
        c.sacar(10);
        c.exibir();

        System.out.println("--- CONTA ESPECIAL--- ");
        ContaEspecial ce = new ContaEspecial("987654", "Segundo Cliente");
        ce.depositar(50);
        ce.sacar(60);
        ce.exibir();

        // --- APLICANDO EM VETOR ---
        Conta contas[] = new Conta[10]; //Dessa forma, eu posso aplicar em cada um dos vetores um tipo de conta, veja:
        contas[0] = new Conta ("123", "Cliente 1");
        contas[1] = new ContaEspecial ("456", "Cliente 2");

        //Se o ContaEspecial tivesse uma subclasse, tudo que fosse puxado de Conta seria duplicado, pois seria feito o de ContaEspecial e o de Conta
        contas[0].exibir();
        contas[1].exibir();

        //contas[1].setLimite; ---> Isso não daria certo, pois contas[1] foi atribuida como Conta
        ContaEspecial ca = (ContaEspecial) contas[1];
        ca.setLimite(200);

        contas[1].exibir();

        //Não é possível com uma que foi instanciada como Conta, então pode-se fazer:
        ContaEspecial teste = new ContaEspecial("Teste", "Teste");

        for (int i = 0; i < 2; i ++)
        {
            if (contas[i] instanceof ContaEspecial)
            {
                teste = (ContaEspecial) contas[i];
             }
        }

        teste.exibir();

        //Pode-se também fazer:
        ((ContaEspecial) contas[1]).setLimite(300);
        contas[1].exibir();
    }
}