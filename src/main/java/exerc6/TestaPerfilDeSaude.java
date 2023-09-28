package exerc6;

import java.util.Scanner;

public class TestaPerfilDeSaude {
    public static void main(String[] args) {
        //    A digitalização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre vários profissionais de saúde.
//    Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas de medicamentos, reduza custos em ambulatórios e salve vidas.
//    Neste exercício, você projetará uma classe PerfilDeSaude para uma pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento,
//    altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
//
//    Para cada atributo, analise a necessidade de fornecer métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
//    intervalo de frequência cardíaca máxima e frequência cardíaca alvo (vide exercício anterior), além de índice de massa corporal (IMC, pesquise a fórmula).
//
//    Escreva um aplicativo Java que solicite as informações da pessoa (utilize Scanner),
//    instancie um objeto da classe PerfilDeSaude para ela e imprima as informações a partir desse objeto
//    incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e então calcule e imprima a idade em anos, IMC,
//    intervalo de frequência cardíaca máxima e frequência cardíaca alvo.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o sexo: ");
        String sexo = scanner.nextLine();

        System.out.println("Digite a data de nascimento: (dd/mm/aaaa)");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite a altura: ");
        Double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso");
        Double peso = Double.parseDouble(scanner.nextLine());

        var pessoa = new PerfilDeSaude();

        pessoa.setNome(nome);
        pessoa.setSobrenome(sobrenome);
        pessoa.setSexo(sexo);
        pessoa.setDtNascimento(dataNascimento);
        pessoa.setAltura(altura);
        pessoa.setPeso(peso);

        System.out.println(pessoa);

        System.out.println("Idade: " + pessoa.calcularIdade());
        System.out.println("Frequência cardíaca máxima: " + pessoa.calcularFrequenciaCardiacaMaxima());
        System.out.println(pessoa.calcularFrequenciaCardiacaAlvo());
        System.out.println("IMC: " + pessoa.calcularIMC());

    }
}
