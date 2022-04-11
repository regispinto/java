package Testes;

import Classes.CalculadorImposto;
import Classes.SeguroVida;
import Classes.Tributavel;

public class TestaTributaveis {
    public static void main(String[] args) {
        Classes.ContaCorrente cc = new Classes.ContaCorrente(222, 333);
        cc.deposita(100.0);

        Classes.SeguroVida seguro = new SeguroVida();

        Classes.CalculadorImposto ci = new CalculadorImposto();
        ci.registra((Tributavel) cc);
        ci.registra(seguro);

        System.out.println(ci.getTotalImposto());
    }
}
