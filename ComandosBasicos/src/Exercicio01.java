import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();

        int soma = primeroNumero + segundoNumero;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
