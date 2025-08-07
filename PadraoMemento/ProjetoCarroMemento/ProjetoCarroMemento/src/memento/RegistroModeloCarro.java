package memento;

public class RegistroModeloCarro {
    private final float altura;
    private final float largura;
    private final float volumeCarga;
    private final float entreEixos;

    RegistroModeloCarro(float altura, float largura, float volumeCarga, float entreEixos) {
        this.altura = altura;
        this.largura = largura;
        this.volumeCarga = volumeCarga;
        this.entreEixos = entreEixos;
    }

    float getAltura() {
        return altura;
    }

    float getLargura() {
        return largura;
    }

    float getVolumeCarga() {
        return volumeCarga;
    }

    float getEntreEixos() {
        return entreEixos;
    }
}