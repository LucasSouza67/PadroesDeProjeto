package exemplo2;

//Decoradores concretos
//RealcePalavrasChave.java
public class RealcePalavrasChave extends DecoradorEditor {
 private String[] palavrasChave;

 public RealcePalavrasChave(Editor editor, String[] palavrasChave) {
     super(editor);
     this.palavrasChave = palavrasChave;
 }

 @Override
 public String processar() {
     String textoProcessado = editor.processar();
     String textoRealcado = realcarTexto(textoProcessado);
     return textoRealcado + "\n[RealcePalavrasChave] Palavras-chave realçadas.";
 }

 private String realcarTexto(String texto) {
     for (String palavra : palavrasChave) {
         // Um realce simples, usando asteriscos para exemplificar
         texto = texto.replaceAll("\\b" + palavra + "\\b", "*" + palavra.toUpperCase() + "*");
     }
     return texto;
 }
}
