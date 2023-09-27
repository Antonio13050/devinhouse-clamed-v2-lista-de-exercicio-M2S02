package exerc5;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private LocalDate dtNascimento;
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public FrequenciaCardiaca(String nome, String sobrenome, String dtNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = LocalDate.parse(dtNascimento, formatoData);
    }

    public int calcularIdade(){
        return Period.between(this.dtNascimento, LocalDate.now()).getYears();

    }

    public int calcularFrequenciaCardiacaMaxima(){
        return 220 - calcularIdade();
    }

    public String calcularFrequenciaCardiacaAlvo(){
        return "A frequência cardíaca alvo está entre " + (calcularFrequenciaCardiacaMaxima() * 0.5) + " e " + (calcularFrequenciaCardiacaMaxima() * 0.85) + " batimentos por minuto";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDtNascimento() {
        return formatoData.format(dtNascimento);
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = LocalDate.parse(dtNascimento, formatoData);
    }
}
