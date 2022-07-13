package exercicios.dois;

public class ProdutoEletronico {
	
	private String tipo;
	private double valor;
	
	ProdutoEletronico(String tipo, double valor){
		this.tipo = tipo;
		this.valor = valor; 
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Tipo: " + this.getTipo()
		+ "\nValor: R$" + this.getValor();
	}
	
}
