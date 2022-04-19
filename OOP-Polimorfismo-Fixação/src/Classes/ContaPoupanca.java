package Classes;

public class ContaPoupanca extends Conta implements Tributavel {
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean deposita(double valor) {
        if(valor > 0){
            super.saldo += valor;
            return true;
        }
        System.out.println("O depóstio inicial deve ser maior que zero");
        return false;
    }

    @Override
    public double getValorImposto() {
        return 0;
    }

    @Override
    public String toString() {
        return "ContaPoupanca, " + super.toString();
    }
}
