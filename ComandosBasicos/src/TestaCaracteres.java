public class TestaCaracteres {
    public static void main(String[] args) {

        //char letra = ''; // Não compila

        char letra = 'a';
        System.out.println(letra);

        char valorA = 65;  // Compila!
        System.out.println(valorA);

        //valorA = valorA + 1;                // Não compila!
        valorA = (char) (valorA + 1);         // Compila!
        System.out.println(valorA);

        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra = "alura cursos online de tecnologia" + 2022;
        System.out.println(palavra);


    }
}
