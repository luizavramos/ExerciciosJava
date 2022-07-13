package exercicios.um;

public class Cliente {


		
		private String nome;
		private int idade;
		private char sexo;
		
		Cliente(String nome, int idade, char sexo){
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;
		}
		
		
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
		
		public char getSexo() {
			return sexo;
		}
		
		public void setSexo(char sexo) {
			this.sexo = sexo;
		} 
		
		
		@Override
		public String toString() {
			return "Nome: " + this.getNome()
			+ "\nIdade: " + this.getIdade() +
			"\nSexo: " + this.sexo;
		}
		
		
		

	

}
