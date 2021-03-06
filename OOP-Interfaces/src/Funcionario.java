public abstract class Funcionario {

    private String nome;
    private String cpf;

    // O modificador protected torna o atributo público somente para as classes filhas,
    // porém o ideal é que os atributos sejam sempre privados
    //protected double salario;
    private double salario;

    public double getSalarioLiquido(double bonificacao){
        return this.salario + bonificacao;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // O método getBonificacao passaou a ser Abstract e as implementações devem ser feitas diretamente nas classes filhas,
    // porém a assinatura do método deve existir na classe mãe (super classe)
    public abstract double getBonificacao();
    //{
    //    return this.salario * 0.5;
    //}


}
