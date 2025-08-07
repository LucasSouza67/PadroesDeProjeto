package exemplo2;

//Decoradores concretos
public class TextoSimples implements Editor {
	private String texto;

	public TextoSimples(String texto) {
		this.texto = texto;
	}

	public String processar() {
		return texto;
	}
}


