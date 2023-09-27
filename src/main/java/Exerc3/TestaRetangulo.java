package Exerc3;

public class TestaRetangulo {
    public static void main(String[] args) {

        var retangulo = new Retangulo();
        System.out.printf("Comprirmento: %.1f \nLargura: %.1f",retangulo.getComprimento(),retangulo.getLargura());

        retangulo.setComprimento(19);
        retangulo.setComprimento(21);

        System.out.println("\nNovo comprimento: " + retangulo.getComprimento());

        double perímetro = retangulo.calcularPerimetro();

        double area = retangulo.calcularArea();

        System.out.printf("Área: %.1f \nPerímetro: %.1f", area, perímetro);
    }
}
//    Crie uma classe Retangulo com os atributos comprimento e largura, cada um dos quais assume o valor padrão de 1.
//    Forneça os métodos que calculam o perímetro e a área do retângulo.
//    A classe tem métodos set e get para o comprimento e a largura.
//    Os métodos set devem verificar se comprimento e largura são, cada um, números de ponto flutuante maiores que 0,0 e menores que 20,0.
//    Escreva um programa para testar a classe Retangulo.