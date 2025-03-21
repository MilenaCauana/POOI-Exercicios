//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(); //Nessa atribuição, o ponteiro aluno1 aponta para uma área de memória alocada para o objeto
        //Ao fazermos aluno1. teremos acesso a tudo que é público nessa classe
        aluno1.setNome("Milena Cauana Rejani Eduardo");
        aluno1.setRA("1234mi");
        boolean trabalho1 = aluno1.setTrabalho1(6);
        boolean trabalho2 = aluno1.setTrabalho2(8);
        boolean prova1 = aluno1.setProva1(8);
        boolean prova2 = aluno1.setProva2(9);

        //Agora, iremos olhar se atributos foram de fato setados
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("RA: " + aluno1.getRA());
        if (trabalho1)
        {
            System.out.println("Trabalho 1: " + aluno1.getTrabalho1());
        } else
        {
            System.out.println("Nota Trabalho 1 inválida!");
        }

        if (trabalho2)
        {
            System.out.println("Trabalho2: " + aluno1.getTrabalho2());
        } else
        {
            System.out.println("Nota Trabalho 2 Inválida");
        }

        if (prova1)
        {
            System.out.println("Prova 1: " + aluno1.getProva1());
        }else
        {
            System.out.println("Nota Prova 1 Inválida");
        }

        if (prova2)
        {
            System.out.println("Prova 2: " + aluno1.getProva2());
        } else
        {
            System.out.println("Nota Porva 2 inválida!");
        }

        System.out.println("Media: " + aluno1.media());

        if(aluno1.aprovado())
        {
            System.out.println("Aprovado!");
        } else
        {
            System.out.println("Reprovado!");
        }
    }
}