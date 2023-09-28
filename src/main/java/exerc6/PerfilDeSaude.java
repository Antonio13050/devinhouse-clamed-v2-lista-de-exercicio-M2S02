package exerc6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private LocalDate dtNascimento;
    private Double altura;
    private Double peso;
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public PerfilDeSaude(){

    }

    public PerfilDeSaude(String nome, String sobrenome, String sexo, String dtNascimento, Double altura, Double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dtNascimento = LocalDate.parse(dtNascimento, formatoData);
        this.altura = altura;
        this.peso = peso;
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

    public double calcularIMC(){
        return this.peso / (this.altura * 2);
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDtNascimento() {
        return formatoData.format(this.dtNascimento);
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = LocalDate.parse(dtNascimento, formatoData);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "PerfilDeSaude{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dtNascimento=" + formatoData.format(this.dtNascimento) +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
