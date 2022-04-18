import java.sql.SQLOutput;
import java.util.Locale;

public class TestaString {
    public static void main(String[] args) {
        String nome = "Cursos Alura - Java"; // objeto literal
        //Estância intrisica do objeto String
        //String outro = new String("Alura");
        System.out.println("String nome: " + nome);

        // Métodos da Classe String
        // Replace()
        String aux = nome.replace("A", "a");
        System.out.println("Método replace(): " + aux);

        // toLowerCase()
        String aux1 = nome.toLowerCase();
        System.out.println("Método toLowerCase(): " + aux1);

        // toUpperCase()
        String aux2 = nome.toUpperCase();
        System.out.println("Método toUpperCase(): " + aux2);

        //indexOf()
        int posicao1 = nome.indexOf("ur");
        System.out.println("Método indexOf('u'): " + posicao1);

        int posicao2 = nome.indexOf("ur");
        System.out.println("Método indexOf(ur): " + posicao2);

        // charAt()
        char c = nome.charAt(10);
        System.out.println("Método charAt(10): " + c);

        // length()
        System.out.println("Método length(): " + nome.length());

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        // isEmpty()
        String vazio1 = "";
        System.out.println("Método isEmpty(): " + vazio1.isEmpty());

        String vazio2 = "Teste";
        System.out.println("Método isEmpty(): " + vazio2.isEmpty());

        // trim()
        String aux3 = " Teste ";
        System.out.println("aux3 sem o método trim(): " + "[" + aux3 + "]");
        System.out.println("aux3 com o método trim(): " + "[" + aux3.trim() + "]");

        // contains()
        System.out.println("String nome: " + nome);
        System.out.println("Método contains(jav): " + nome.contains("jav"));
        System.out.println("Método contains(Jav): " + nome.contains("Jav"));
    }
}
