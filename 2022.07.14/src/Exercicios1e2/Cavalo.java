package Exercicios1e2;

public class Cavalo extends Animal {


    public void acaoBicho() {

        System.out.println(" Cavalo Correndo");
    }

    public void som() {
        System.out.println(" Cavalo Relinchando");
    }
    public Cavalo(String nome, int idade) {
        super();
        this.setNome(nome);
        this.setIdade(idade);

    }


    @Override
    public String toString() {
        return "Cavalo Nome: "+ this.getNome() + "\n Idade: " +
                this.getIdade() ;
    }
}
