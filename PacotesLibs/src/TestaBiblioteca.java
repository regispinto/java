import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(123, 321);

        c.deposita(200.3);

        System.out.println(c.getSaldo());
    }

}
