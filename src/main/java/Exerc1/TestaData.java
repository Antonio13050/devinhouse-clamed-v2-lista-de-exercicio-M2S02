package Exerc1;

public class TestaData {
    public static void main(String[] args) {
        Data data = new Data(1992,9,4);

        data.exibirData();

        System.out.printf("Dia %d Mês %d Ano %d \n",data.getDia(), data.getMes(), data.getAno());

        data.setAno(1993);
        data.setMes(5);
        data.setDia(5);

        System.out.printf("Dia %d Mês %d Ano %d \n",data.getDia(), data.getMes(), data.getAno());
    }
}
