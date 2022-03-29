// Gerente é um funcionário que exige autenticação, herda a Class Funcionário e "assina"
// o contrato (Interface) Autenticacao
public class Gerente extends Funcionario implements Autenticacao {

    private int senha;

    public double getBonificacao(){
        // "super" indica que os métodos são da classe mãe (super classe)
        // Regra da bonificação do Gerente: 10% do Salário
        return super.getSalario() * 0.1;
    }

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
