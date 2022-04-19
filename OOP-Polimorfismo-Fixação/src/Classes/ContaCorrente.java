package Classes;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
    //public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
    //    return super.saca(valorASacar);
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
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }
}
