package exerc4;

public class TestaFatura {
    public static void main(String[] args) {

        var fatura = new Fatura("1", "teste", 2, 3.99);
        double valorFatura = fatura.getValorFatura();

        System.out.println("Preço: " + fatura.getPreco());
        System.out.println("Quantidade: " + fatura.getQtdComprada());
        System.out.println("Valor total: " + valorFatura);

        fatura.setPreco(-1.6);
        System.out.println("Preço: " + fatura.getPreco());

        fatura.setQtdComprada(-2);
        System.out.println("Quantidade: " + fatura.getQtdComprada());
    }
}
