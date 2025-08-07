package memento;

public class Cliente {

    public static void main(String[] args) {
        ModeloCarro modelo = new ModeloCarro();

        modelo.setAltura(1.4f);
        modelo.setLargura(1.8f);
        modelo.setVolumeCarga(1.3f);
        modelo.setEntreEixos(3.9f);

        VerificadorModeloCarro verificador = new VerificadorModeloCarro(modelo);

        System.out.println("Modelo antes dos ajustes:\n" + verificador.getModeloCarro().getInfoCarro() + "\n");

        verificador.fazerAjustes(0.4f, -0.6f, 1f, -1.8f);

        System.out.println("Modelo após ajustes:\n" + verificador.getModeloCarro().getInfoCarro() + "\n");

        if (!testarModelo(verificador.getModeloCarro())) {
            verificador.desfazerAjustes();
            System.out.println("Modelo após falha no teste:\n" + verificador.getModeloCarro().getInfoCarro() + "\n");
        }
    }

    public static boolean testarModelo(ModeloCarro modelo) {
        float valor = (modelo.getEntreEixos() / modelo.getAltura()) * modelo.getLargura();
        return valor < 2 * modelo.getEntreEixos()
                && valor > 2.5 * modelo.getVolumeCarga();
    }
}