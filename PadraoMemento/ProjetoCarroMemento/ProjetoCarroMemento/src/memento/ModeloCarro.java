package memento;

public class ModeloCarro {
    private float altura;
    private float largura;
    private float volumeCarga;
    private float entreEixos;

    public void restaurarModelo(RegistroModeloCarro registro) {
        this.altura = registro.getAltura();
        this.largura = registro.getLargura();
        this.volumeCarga = registro.getVolumeCarga();
        this.entreEixos = registro.getEntreEixos();
    }

    public RegistroModeloCarro criarRegistro() {
        return new RegistroModeloCarro(
                this.altura,
                this.largura,
                this.volumeCarga,
                this.entreEixos
        );
    }

    public String getInfoCarro() {
        return "Altura: " + this.altura +
                "\nLargura: " + this.largura +
                "\nVolume de carga: " + this.volumeCarga +
                "\nEntre-eixos: " + this.entreEixos;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getVolumeCarga() {
        return volumeCarga;
    }

    public void setVolumeCarga(float volumeCarga) {
        this.volumeCarga = volumeCarga;
    }

    public float getEntreEixos() {
        return entreEixos;
    }

    public void setEntreEixos(float entreEixos) {
        this.entreEixos = entreEixos;
    }
}