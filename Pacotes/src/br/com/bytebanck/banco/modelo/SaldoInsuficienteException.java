package br.com.bytebanck.banco.modelo;

public class SaldoInsuficienteException extends Exception {  //checked
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
