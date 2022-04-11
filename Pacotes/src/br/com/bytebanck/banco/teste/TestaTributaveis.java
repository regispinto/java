package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.*;

public class TestaTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroVida seguro = new SeguroVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(cc);
        ci.registra(seguro);

        System.out.println(ci.getTotalImposto());
    }
}
