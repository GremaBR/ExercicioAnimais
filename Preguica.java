
public class Preguica extends Animal {
	
	String nome;
	int idade;
	String som;
	String movimento = "Subir na Árvore";
	
	public Preguica(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);
        this.nome = nome;
        this.idade = idade;
        this.som = som;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String emitirSom() {
		return som;
	}
	
	public String movimentar() {
		return movimento;
	}

}
