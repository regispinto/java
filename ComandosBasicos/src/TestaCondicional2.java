public class TestaCondicional2 {
    public static void main(String[] args) {
        int idade = 15;
        int quantidadePessoas = 2;
        boolean acessoLiberado = (idade >= 18 || quantidadePessoas > 2);

        if (acessoLiberado) {
            if (idade < 18) {
                System.out.println("Você não tem 18 anos, mas pode acessar " +
                        "pois está acompanhado");
            } else {
                System.out.println("Acesso liberado!");
            }
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Você é menor de idade");
            System.out.println("Acesso negado!");
        }
    }
}
