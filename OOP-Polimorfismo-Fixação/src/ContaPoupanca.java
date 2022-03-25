public class ContaPoupanca extends Conta {

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
}
