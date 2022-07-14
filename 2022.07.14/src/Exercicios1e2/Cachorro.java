package Exercicios1e2;

public class Cachorro extends Animal{
    private String Latir = "au au";


    public void acaoBicho() {

        System.out.println(" Cachorro Correndo");
    }

    public void som() {
        System.out.println(" Cachorro Latindo");
    }

    public String getLatir() {
        return Latir;
    }

    public void setLatir(String latir) {
        Latir = latir;
    }
    @Override
    public String toString() {
        return "Nome: "+ this.getNome() + "\nIdade: " +
                this.getIdade() + "\n" +
                this.getLatir();
    }
}
