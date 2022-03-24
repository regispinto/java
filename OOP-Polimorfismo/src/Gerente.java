// A classe Gerente herda da Classe Funcionario
public class Gerente extends Funcionario {
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

    public double getBonificacao(){
        // "super" indica que os atributos e os métodos são da super classe ou classe mãe
        System.out.println("Vai bonificação do GERENTE " + );
        return super.getBonificacao() + super.getSalario();
    }
}
