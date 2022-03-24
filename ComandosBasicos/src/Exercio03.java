import java.util.Scanner;

public class Exercio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        int terceiroNumero = sc.nextInt();
        int quartoNumero = sc.nextInt();

        int diferenca = (primeroNumero * segundoNumero - terceiroNumero * quartoNumero);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
