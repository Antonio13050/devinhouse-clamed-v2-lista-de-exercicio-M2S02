package Exerc2;

public class PessoaFisica {
    private int id;
    private String nome;
    private String cpf;

    public PessoaFisica(String cpf) {
        setCpf(cpf);
    }

    public boolean validaCpf(String cpf){
        return cpf.length() == 11;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws IllegalArgumentException{

            if (validaCpf(cpf)) {
                this.cpf = cpf;
            } else {
                throw new IllegalArgumentException("O CPF não é válido");
            }

    }
}

//    Crie uma classe PessoaFisica e pense em quais atributos ela deve possuir. Um deles, obrigatoriamente, será o CPF. Garanta que nenhuma pessoa física seja criada sem um CPF,
//    e que nenhuma pessoa física possua um CPF inválido. (Não é preciso criar o algoritmo de validação de CPF, apenas a assinatura do método)
