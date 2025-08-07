package exemplo1;

public class Main {

	public static void main(String[] args) {
		 	// cria o objeto
	        Coquetel meuCoquetel = new Cachaca();
	        
	        // coquetel sem adicional
	        System.out.println(meuCoquetel.getNome() + " = "
	                + meuCoquetel.getPreco());
	        
	        // coquetel com adicional de refrigerante
	        meuCoquetel = new Refrigerante(meuCoquetel);
	        System.out.println(meuCoquetel.getNome() + " = "
	                + meuCoquetel.getPreco());

	}

}
