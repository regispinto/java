public class Desinger extends Funcionario {

    public double getBonificacao() {
        // "super" indica que os métodos são da classe mãe (super classe)
        // Regra da bonificação do Desinger: 5% do Salário

        return super.getSalario() * 0.05;
    }
}
