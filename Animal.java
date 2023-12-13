
public abstract class Animal {
	
	String nome;
	int idade;
	String som;
	String movimento;
	
	public Animal(String nome,int idade,String som,String movimento) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.movimento = movimento;
	}
	public abstract String getNome();
	public abstract int getIdade();
	public abstract String emitirSom();
	public abstract String movimentar();

}
