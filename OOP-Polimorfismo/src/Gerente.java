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
        // "super" indica que os atributos e os métodos são da super classe ou classe mãe
        System.out.println("Vai retornar a bonificação do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }
}
