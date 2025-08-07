package exemplo2;

//Decorador abstrato
public abstract class DecoradorEditor implements Editor {
	protected Editor editor; // O objeto Editor que está sendo decorado

	public DecoradorEditor(Editor editor) {
		this.editor = editor;
	}

	public String processar() {
		return editor.processar(); //Delega a chamada ao objeto decorado
	}
}
