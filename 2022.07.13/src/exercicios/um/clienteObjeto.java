package exercicios.um;

public class clienteObjeto {

	public static void main(String[] args) {
		
		Cliente fulana = new Cliente("Beatriz", 23, 'F');
		fulana.setIdade(25);
		fulana.setNome("Beatriz");
		fulana.setSexo('F');
		
		
		System.out.println(fulana.toString());
		
		Cliente ciclana = new Cliente ("Joana", 12,'F');
		
		System.out.println(ciclana.toString());
		

	}

}
