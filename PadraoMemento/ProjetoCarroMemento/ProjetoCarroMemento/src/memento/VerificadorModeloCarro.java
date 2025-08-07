package memento;

public class VerificadorModeloCarro {

    private ModeloCarro modeloCarro;
    private RegistroModeloCarro registroSalvo;

    public VerificadorModeloCarro(ModeloCarro modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public ModeloCarro getModeloCarro() {
        return modeloCarro;
    }

    public void fazerAjustes(float alturaAdd, float larguraAdd,
                             float volumeCargaAdd, float entreEixosAdd) {
        this.registroSalvo = modeloCarro.criarRegistro();

        modeloCarro.setAltura(modeloCarro.getAltura() + alturaAdd);
        modeloCarro.setLargura(modeloCarro.getLargura() + larguraAdd);
        modeloCarro.setVolumeCarga(modeloCarro.getVolumeCarga() + volumeCargaAdd);
        modeloCarro.setEntreEixos(modeloCarro.getEntreEixos() + entreEixosAdd);
    }

    public void desfazerAjustes() {
        this.modeloCarro.restaurarModelo(this.registroSalvo);
    }
}