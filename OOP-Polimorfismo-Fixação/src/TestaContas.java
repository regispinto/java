public class TestaContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 456);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(123, 654);
        cp.deposita(500.0);

        cc.transfere(10.0, cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}
