import java.util.ArrayList;
import java.util.Collection;

public class Zoologico {

	ArrayList <Animal> Jaulas = new ArrayList<Animal>();
	
	
	public Zoologico() {
		Jaulas.add(new Cachorro("Klebinho", 2, "Auau", "Correr"));
		Jaulas.add(new Cavalo("Nasus", 6, "Iiirrrrí", "Correr"));
		Jaulas.add(new Preguica("Nadinha", 1, "AAAAhh", "Subir na Árvore"));
		Jaulas.add(new Cachorro("Cleytom", 1, "Auau", "Correr"));
		Jaulas.add(new Cavalo("PegaSUS", 4, "Iiirrrrí", "Correr"));
		Jaulas.add(new Preguica("Jota", 3, "AAAAhh", "Subir na Árvore"));
		Jaulas.add(new Cachorro("Norberto", 3, "Auau", "Correr"));
		Jaulas.add(new Cavalo("Luke", 7, "Iiirrrrí", "Correr"));
		Jaulas.add(new Preguica("Priscilla", 4, "AAAAhh", "Subir na Árvore"));
		Jaulas.add(new Preguica("Jubileu", 2, "AAAAhh", "Subir na Árvore"));
	}
	
	
	public void chamarAnimais() {
	    for (Animal animal : Jaulas) {
	        System.out.println(animal.getNome() + " " + animal.getIdade() + " " + animal.emitirSom());
	        if ("Correr".equals(animal.movimentar())) System.out.println(animal.movimentar());
	    }
	}
}
