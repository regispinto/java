public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        } catch(Exception ex) { // Exception genérico
            String msg = ex.getMessage();
            System.out.println("Mensagem : " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new NullPointerException("deu muito errado");
        //throw new ArithmeticException("deu muito errado");
        //System.out.println("Fim do metodo2");
    }
}
