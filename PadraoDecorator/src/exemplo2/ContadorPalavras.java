package exemplo2;

//Decoradores concretos

public class ContadorPalavras extends DecoradorEditor {
	public ContadorPalavras(Editor editor) {
		super(editor);
	}

	public String processar() {
		String texto = super.processar();
		int palavras = texto.trim().isEmpty() ? 0 : texto.trim().split("\\s+").length;
		return texto + "\n[Contador de palavras: " + palavras + "]";
	}
}