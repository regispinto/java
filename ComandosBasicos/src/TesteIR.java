public class TesteIR {
    public static void main(String[] args) {
        String faixa = "";

        double salario = 2900.0;
        double impostoRetido = 0;
        double valorRetido = 0;
        double limiteDesconto = 0;

        double[] primeiraFaixaIR = {1900.0, 2800.0, 7.5, 142};
        double[] segundaFaixaIR = {2800.01, 3751.0, 15, 350};
        double[] terceiraFaixaIR = {3751.01, 4664.00, 22.5, 636};

        if (salario >= primeiraFaixaIR[0] && salario <= primeiraFaixaIR[1]) {
            faixa = "Primeira";

            impostoRetido = (salario * primeiraFaixaIR[2]) / 100;

            if (impostoRetido > primeiraFaixaIR[3]) {
                valorRetido = primeiraFaixaIR[3];
            }

        } else if (salario >= segundaFaixaIR[0] && salario <= segundaFaixaIR[1]) {
            faixa = "Segunda";

            impostoRetido = (salario * segundaFaixaIR[2]) / 100;

            if (impostoRetido > segundaFaixaIR[3]) {
                valorRetido = segundaFaixaIR[3];
            }

        } else if (salario >= terceiraFaixaIR[0] && salario <= terceiraFaixaIR[1]) {
            faixa = "Terceira";

            impostoRetido = (salario * terceiraFaixaIR[2]) / 100;

            if (impostoRetido > terceiraFaixaIR[3]) {
                valorRetido = terceiraFaixaIR[3];
            }
        }
        System.out.println("Faixa: " + faixa);
        System.out.printf("Imposto Retido: %.2f%n ", impostoRetido);
        System.out.printf(" Valor Retido: %.2f%n", valorRetido);
    }
}