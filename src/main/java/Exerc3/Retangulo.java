package Exerc3;

public class Retangulo {
    private double comprimento = 1;
    private double largura = 1;

    public double calcularPerimetro() {
        return (this.largura + this.comprimento) * 2;
    }

    public double calcularArea() {
        return this.largura * this.comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }

    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
        }
    }
}
