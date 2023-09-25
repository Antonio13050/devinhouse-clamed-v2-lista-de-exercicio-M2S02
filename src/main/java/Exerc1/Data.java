package Exerc1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

    int mes;
    int dia;
    int ano;

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

    //    Crie uma classe chamada Data que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
//    Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos.
//    Ofereça um método set e um get para cada variável de instância. Apresente um método exibirData que exiba mês, dia e ano separados por barras normais (/).
//    Escreva um aplicativo de teste chamado TestaData que demonstre as capacidades da classe Data
}
