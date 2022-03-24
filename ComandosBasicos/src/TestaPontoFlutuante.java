public class TestaPontoFlutuante {
    public static void main (String args[]) {
        double salario;
        salario = 1250.70;
        System.out.println("meu salário é " + salario);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        // Como a variável é do tipo inteira e o cálculo é uma divisão é de dois números inteiros,
        // o resustado será um número inteiro.
        int outraDivisao = 5 / 2;
        System.out.println("5/2=" + outraDivisao + "??");

        // A dica é definir o tipo como double e "transformar" a tipagem do divisor também em double, ai o resultado
        // fica correto
        double outraTentativa = 5.0 / 2;
        System.out.println(outraTentativa);

        //int teste = 12.5;    Não compila
    }
}