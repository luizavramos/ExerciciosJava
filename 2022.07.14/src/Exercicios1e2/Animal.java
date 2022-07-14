package Exercicios1e2;

public class Animal  {
    private String nome;
    private int idade;
    private String Som;
    private String acao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return Som;
    }

    public void setSom(String som) {
        Som = som;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
    public void acaoBicho(){

    }
    public void som(){
        System.out.println("O som da ");
    }


}
