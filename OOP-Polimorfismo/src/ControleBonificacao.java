public class ControleBonificacao {
    private double soma;

    public double registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma += boni;
        return boni;
    }

    public double getSoma() {
        return this.soma;
    }
}
