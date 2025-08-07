package exemplo2;

public class Main {
	public static void main(String[] args) {
        Editor editor = new TextoSimples("Essa é uma informação muito muito importante que vc deve lembrar");

        // 1. Editor de texto simples
        Editor editorSimples = new TextoSimples("Este eh um txto simpres para demonstrar o padrao Decorator e suas capacidades ortografco.");
        System.out.println("--- Editor Simples ---");
        System.out.println(editorSimples.processar());
        System.out.println("\n----------------------\n");

        // 2. Editor com contador de palavras
        Editor editorComContador = new ContadorPalavras(new TextoSimples("Este eh um texto de teste."));
        System.out.println("--- Editor com Contador de Palavras ---");
        System.out.println(editorComContador.processar());
        System.out.println("\n----------------------\n");

        // 3. Editor com corretor ortográfico
        Editor editorComCorretor = new CorretorOrtografico(new TextoSimples("Este eh um txto simpres para demonstrar o padrao Decorator e suas capacidades ortografco."));
        System.out.println("--- Editor com Corretor Ortográfico ---");
        System.out.println(editorComCorretor.processar());
        System.out.println("\n----------------------\n");

        // 4. Editor com contador de palavras E corretor ortográfico
        Editor editorCompleto = new CorretorOrtografico(new ContadorPalavras(
                new TextoSimples("Este eh um txto simpres para demonstrar o padrao Decorator e suas capacidades ortografco.")));
        System.out.println("--- Editor com Contador e Corretor ---");
        System.out.println(editorCompleto.processar());
        System.out.println("\n----------------------\n");

        // 5. Editor com todas as funcionalidades
        String[] palavrasChave = {"Decorator", "texto", "ortográfico"};
        Editor editorSuperCompleto = new RealcePalavrasChave(
                                        new CorretorOrtografico(
                                            new ContadorPalavras(
                                                new TextoSimples("Este eh um txto simpres para demonstrar o padrao Decorator e suas capacidades ortografco."))
                                        ), palavrasChave
                                    );
        System.out.println("--- Editor Super Completo (Contador, Corretor, Realce) ---");
        System.out.println(editorSuperCompleto.processar());
        System.out.println("\n----------------------\n");
    }
}
