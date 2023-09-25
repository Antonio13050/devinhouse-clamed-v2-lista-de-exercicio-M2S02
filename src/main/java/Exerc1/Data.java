package Exerc1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

    private int mes;
    private int dia;
    private int ano;

    public Data(int ano, int mes, int dia) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void exibirData(){
        LocalDate data = LocalDate.of(this.ano,this.mes,this.dia);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatoData);
        System.out.println(dataFormatada);

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
