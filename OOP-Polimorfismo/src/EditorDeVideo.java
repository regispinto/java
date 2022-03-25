public class EditorDeVideo extends Funcionario {

    public double getBonificacao() {
        // "super" indica que os métodos são da classe mãe (super classe)
        // Regra da bonificação do Editor de Vídeo: 15% do Salário

        return super.getSalario() * 0.15;
    }
}
