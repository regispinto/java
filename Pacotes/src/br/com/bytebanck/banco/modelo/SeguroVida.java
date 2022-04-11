package br.com.bytebanck.banco.modelo;

public class SeguroVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
