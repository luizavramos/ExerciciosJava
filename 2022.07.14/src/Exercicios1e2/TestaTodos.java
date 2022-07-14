package Exercicios1e2;

public class TestaTodos {
    public static void main(String[] args) {

        Cachorro floquinho = new Cachorro();

        floquinho.setNome("Floquinho");
        floquinho.setIdade(14);
       ;

        floquinho.acaoBicho();
        floquinho.som();

        System.out.println(floquinho.getLatir());
        System.out.println(floquinho.getIdade());
        System.out.println(floquinho);

        Cavalo spirit = new Cavalo("Spirit", 14);
        System.out.println(spirit);
        spirit.acaoBicho();
        spirit.som();

        Preguiça priscila = new Preguiça("Priscila", 18);
        System.out.println(priscila);
        priscila.acaoBicho();
        priscila.som();

    }





}