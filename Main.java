
public class Main {

	public static void main(String[] args) {
		Zoologico zoologico = new Zoologico();
		zoologico.chamarAnimais();
		Veterinario veterinario = new Veterinario("João",19);
		veterinario.examinar(zoologico.Jaulas.get(0), zoologico.Jaulas.get(1), zoologico.Jaulas.get(2));
	}

}
