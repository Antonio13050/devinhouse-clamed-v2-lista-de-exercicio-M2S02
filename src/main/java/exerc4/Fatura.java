package exerc4;

public class Fatura {

    private String numero;
    private String descricao;
    private int qtdComprada;
    private Double preco;

    public Fatura(String numero, String descricao, int qtdComprada, Double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.preco = preco;
    }



    public double getValorFatura(){
        return this.preco * this.qtdComprada;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        if(qtdComprada < 0 ) {
            this.qtdComprada = 0;
        } else {
            this.qtdComprada = qtdComprada;
        }
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {

        if(preco < 0 ) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }
}
