package exerc5;

import java.time.LocalDate;

public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {

        var pessoa = new FrequenciaCardiaca("Antonio", "Carlos", "04/09/1992");
        System.out.println(pessoa.getDtNascimento());

        pessoa.setDtNascimento("05/01/1994");
        System.out.println(pessoa.getDtNascimento());

        System.out.println(pessoa.calcularIdade() + " anos");

        System.out.println("Frequência cardíaca máxima por minuto é " + pessoa.calcularFrequenciaCardiacaMaxima());

        System.out.println(pessoa.calcularFrequenciaCardiacaAlvo());


    }
}
//    Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos.
//    Segundo a American Heart Association (AHA), a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos.
//    Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.
//
//    [Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa.
//    Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.
//
//    Crie uma classe chamada FrequenciaCardiaca. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa.
//    Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo, forneça métodos set e get.
//
//    A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne
//    a frequência cardíaca alvo da pessoa.
//
//    Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe FrequenciaCardiaca e imprima as informações a partir desse objeto — incluindo nome,
//    sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.