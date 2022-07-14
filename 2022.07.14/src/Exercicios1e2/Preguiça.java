package Exercicios1e2;

public class Preguiça extends Animal{


    public Preguiça (String nome, int idade) {
        super();
        this.setNome(nome);
        this.setIdade(idade);
 ;

    }

    public void acaoBicho() {

        System.out.println("Preguiça Subindo árvores");
    }
   @Override
    public void som() {
        System.out.println("Preguiça Roncando");
    }

    @Override
    public String toString() {
        return "Preguiça Nome: "+ this.getNome() + "\n Idade: " +
                this.getIdade() ;
    }
}
