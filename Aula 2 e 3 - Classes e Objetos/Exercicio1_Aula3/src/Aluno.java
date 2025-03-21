public class Aluno //Aqui, já criamos uma classe
{
    //Criando atributos, colocamos o private para que a informação não tenha acesso público
    private String ra;
    private String nome;
    private float trabalho1;
    private float trabalho2;
    private float prova1;
    private float prova2;

    /*Para podermos acessar as informações, criaremos métodos para isso,
    o método get obtém informação do objeto retorna as informações dos atributos,
    já o método set, coloca uma informação externa*/

    public String getRA()
    {
        return ra;
    }

    public String getNome()
    {
        return nome;
    }

    public float getTrabalho1()
    {
        return trabalho1;
    }
    public float getTrabalho2()
    {
        return trabalho2;
    }

    public float getProva1()
    {
        return prova1;
    }

    public float getProva2()
    {
        return prova2;
    }

    public void setRA(String ra)
    {
        this.ra = ra;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public boolean setTrabalho1(float trabalho1)
    {
        if(trabalho1 >= 0 && trabalho1 <= 10)
        {
            this.trabalho1 = trabalho1;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean setTrabalho2(float trabalho2)
    {
        if (trabalho2 >= 0 && trabalho2 <= 10)
        {
            this.trabalho2 = trabalho2;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean setProva1(int prova1)
    {
        if(prova1 >= 0 && prova1 <= 10)
        {
            this.prova1 = prova1;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean setProva2(int prova2)
    {
        if (prova2 >= 0 && prova2 <= 10)
        {
            this.prova2 = prova2;
            return true;
        } else
        {
            return false;
        }
    }

    public float media()
    {
        float media = (trabalho1 + trabalho2 + prova1 + prova2) / 4.0f;
        return media;
    }

    public boolean aprovado()
    {
        if (media() >= 5)
        {
            return true;
        } else {
            return false;
        }
    }
}


