
public class Veterinario {
	String nome;
	int idade;
	
	public Veterinario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void examinar(Animal cachorro, Animal cavalo, Animal preguica) {
		System.out.println(cachorro.getNome() + " está sendo examinado pelo veterinário " + this.nome + "! " + cachorro.emitirSom());
		System.out.println(cavalo.getNome() + " está sendo examinado pelo veterinário " + this.nome + "! " + cavalo.emitirSom());
		System.out.println(preguica.getNome() + " está sendo examinado pelo veterinário " + this.nome + "! " + preguica.emitirSom());
	}
}
