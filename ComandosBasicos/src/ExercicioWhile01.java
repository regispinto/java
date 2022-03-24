import java.util.Scanner;

public class ExercicioWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaValida = 2002;

        int senha = sc.nextInt();

        while (senha != senhaValida) {
            System.out.println("Senha inválida");

            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
