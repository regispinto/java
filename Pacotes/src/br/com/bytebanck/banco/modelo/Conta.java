package br.com.bytebanck.banco.modelo;

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

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
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

    public abstract double getValorImposto();
}