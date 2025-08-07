package exemplo2;

//Decoradores concretos
public class CorretorOrtografico extends DecoradorEditor {

 public CorretorOrtografico(Editor editor) {
     super(editor);
 }

 @Override
 public String processar() {
     String textoProcessado = editor.processar();
     String textoCorrigido = corrigirTexto(textoProcessado);
     return textoCorrigido + "\n[CorretorOrtografico] Verificação ortográfica aplicada.";
 }

 private String corrigirTexto(String texto) {
     // Lógica de correção ortográfica simplificada (apenas para exemplo)
     return texto.replace("txto", "texto")
                 .replace("ortografco", "ortográfico")
                 .replace("simpres", "simples");
 }
}