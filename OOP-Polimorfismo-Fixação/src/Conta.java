public abstract class Conta {
    private int agencia;
    private int numero;
    private int anoAbertura;
    private Cliente titular;
    protected double saldo;

    // Seta um novo atributo da Class e não da instância do objeto
    // Static define um atributo da Classe
    private static int total = 0;

    // Constructor
    public Conta(int agencia, int numero, int ano){
        this.agencia = agencia;
        this.numero = numero;
        this.anoAbertura = ano;

        total++;
    }

    // Novo Constructor (Reaproveitamento)
    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.anoAbertura = 2021;

        total++;
    }

    // O método passou a ser Abstract, logo na classe mãe só pode ter a assinatura do método sem implementação,
    // as mesmas devem ser feitas nas classes filhas
    public abstract boolean deposita(double valor);
        //    {
        //        if(valor > 0){
        //            this.saldo += valor;
        //            return true;
        //        }
        //        System.out.println("O depóstio inicial deve ser maior que zero");
        //        return false;
        //    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            // Aqui chama o método específico (saca) da clase ContaCorrente
            if(this.saca(valor)) {
                destino.deposita(valor);
                System.out.println("Transferência realizada com sucesso!");
                return true;
            } else {
                return false;
            }
        }
        System.out.println("Saldo insuficiente na conta!");
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAnoAbertura(){
        return anoAbertura;
    }

    public Cliente getTitular() {
        return titular;
    }

    // getTotal é um método da Classe conta (Static)
    public static int getTotalContas(){
        return Conta.total;
    }
}