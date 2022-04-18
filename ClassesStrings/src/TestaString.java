import java.util.Locale;

public class TestaString {
    public static void main(String[] args) {

        String nome = "Alura"; // objeto literal
      //Estância intrisica do objeto String
      //String outro = new String("Alura");

        String aux = nome.replace("A", "a");
        String aux1 = nome.toLowerCase();
        String aux2 = nome.toUpperCase();

        System.out.println(nome);
        System.out.println(aux);
        System.out.println(aux1);
        System.out.println(aux2);
    }
}
