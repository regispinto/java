// A classe Gerente (é um funcionário) herda da Classe Funcionario
public class Gerente extends Funcionario {
    // por padrão o valor atribuido a variável é zero
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    //novo método, recebendo dois params (SOBRECARGA)
    public boolean autentica(String login, int senha) {
        return true;
    }

    public double getBonificacao(){
        // "super" indica que os métodos são da classe mãe (super classe)
        // Regra da bonificação do Gerente: 10% do Salário
        return super.getSalario() * 0.1;
    }
}
