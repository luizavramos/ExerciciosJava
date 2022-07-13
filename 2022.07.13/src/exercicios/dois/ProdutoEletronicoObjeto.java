package exercicios.dois;

public class ProdutoEletronicoObjeto {

	public static void main(String[] args) {
		ProdutoEletronico tablet = new ProdutoEletronico("Tablet Samsung", 157.75);
		tablet.setValor(325.87);
		
		System.out.println(tablet.toString());

	}

}
