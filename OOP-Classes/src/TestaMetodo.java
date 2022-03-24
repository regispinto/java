public class TestaMetodo {
    public static void main(String[] args) {
        boolean processaTestes = false;

        String[] nomeTitular = {"Pedro da Silva Filho", "João Ricardo Albuquerque", "Felipe da Silva"};
        String[] cpfTitular = {"111.111.111-11", "222.222.222-22", "972.789.788-86"};
        String[] profissaoTitular = {"Dev Jr", "Analista de Sistemas", "Engenheiro Elétrico"};

        int[] numeroConta = {1234, 4321, 5656};
        int[] numeroAgencia = {11111, 55555, 77777};

        double[] saldoInicial = {440.0, 550.0, 200.0};
        double[] valorDepositado = {500.0, 300.0, 1000.0};
        double[] valorSaque = {500.0, 800.0, 200.0};
        double[] valorTransferencia = {500.0, 50.0};

        Cliente cliente1 = new Cliente();
        cliente1.setNome(nomeTitular[0]);
        cliente1.setCpf(cpfTitular[0]);
        cliente1.setProfissao(profissaoTitular[0]);

        Cliente cliente2 = new Cliente();
        cliente2.setNome(nomeTitular[1]);
        cliente2.setCpf(cpfTitular[1]);
        cliente2.setProfissao(profissaoTitular[1]);

        Cliente cliente3 = new Cliente();
        cliente3.setNome(nomeTitular[2]);
        cliente3.setCpf(cpfTitular[2]);
        cliente3.setProfissao(profissaoTitular[2]);

        Conta conta1 = new Conta(numeroAgencia[0], numeroConta[0], 2022);
        System.out.println("Sequência de Abertura: " + Conta.getTotal());

        conta1.setTitular(cliente1);

        Conta conta2 = new Conta(numeroAgencia[1], numeroConta[1], 2022);
        System.out.println("Sequência de Abertura: " + Conta.getTotal());

        conta2.setTitular(cliente2);

        // Instanciando a classe com Constructor alternativo
        Conta conta3 = new Conta(numeroAgencia[2], numeroConta[2]);
        System.out.println("Sequência de Abertura: " + Conta.getTotal());

        conta3.setTitular(cliente3);

        // Simula o saldo inicial da conta1
        if(conta1.deposita(saldoInicial[0])){
            System.out.println("-> Titular: " + conta1.getTitular().getNome());
            System.out.println("   Agencia: " + conta1.getAgencia());
            System.out.println("    Número: " + conta1.getNumero());
            System.out.println("     Saldo: " + conta1.getSaldo());
            System.out.println(" Profissão: " + conta1.getTitular().getProfissao());
            System.out.println("  Abertura: " + conta1.getAnoAbertura());

            if(conta2.deposita(saldoInicial[1])) {
                System.out.println("-> Titular: " + conta2.getTitular().getNome());
                System.out.println("   Agencia: " + conta2.getAgencia());
                System.out.println("    Número: " + conta2.getNumero());
                System.out.println("     Saldo: " + conta2.getSaldo());
                System.out.println(" Profissão: " + conta2.getTitular().getProfissao());
                System.out.println("  Abertura: " + conta2.getAnoAbertura());

                //-- Simula mudar a profissao do titular da conta2
                conta2.getTitular().setProfissao("Analista de Negocios");
                System.out.println("Alterado a profissão do titular da conta2: " + conta2.getTitular().getProfissao());

                if(conta3.deposita(saldoInicial[2])) {
                    System.out.println("-> Titular: " + conta3.getTitular().getNome());
                    System.out.println("   Agencia: " + conta3.getAgencia());
                    System.out.println("    Número: " + conta3.getNumero());
                    System.out.println("     Saldo: " + conta3.getSaldo());
                    System.out.println(" Profissão: " + conta3.getTitular().getProfissao());
                    System.out.println("  Abertura: " + conta3.getAnoAbertura());

                    processaTestes = true;
                }
            }
        }

        if(processaTestes){
            System.out.println("Vai depositar " + valorDepositado[0] + " na conta1...");
            conta1.deposita(valorDepositado[0]);
            System.out.println("Saldo atualizado conta1 [0]: " + conta1.getSaldo());

            System.out.println("Vai sacar " + valorSaque[0] + " da conta1...");
            System.out.println(conta1.saca(valorSaque[0]));
            System.out.println("Saldo atualizado conta1 [1]: " + conta1.getSaldo());

            System.out.println("Vai realizar novo saque de " + valorSaque[1] + " na conta1...");
            System.out.println(conta1.saca(valorSaque[1]));
            System.out.println("Saldo atualizado da conta1 [2]: " + conta1.getSaldo());

            // Vai realizar novo saque verificando se há saldo suficiente na conta
            System.out.println("Vai tentar realizar novo saque de " + valorSaque[2] + " na conta1...");
            boolean conseguiuSacar = conta1.saca(valorSaque[2]);

            if(conseguiuSacar) {
                System.out.println("Saldo atualizado da conta1 [3]: " + conta1.getSaldo());
            }

            System.out.println("Vai depositar " + valorDepositado[1] + " na conta1...");
            conta1.deposita(valorDepositado[1]);
            System.out.println("Saldo atualizado da conta1 [4]: " + conta1.getSaldo());

            System.out.println("Vai tentar sacar mais " + valorSaque[2] + " da conta1 após depósito...");
            conseguiuSacar = conta1.saca(valorSaque[2]);

            if(conseguiuSacar) {
                System.out.println("Saldo atualizado [5]: " + conta1.getSaldo());
            }
            /*
            // Simula 1ª transferência - Com saldo suficiente
            System.out.println("Vai transferir " + valorTransferencia[0] + " da Conta1 para a Conta2");
            boolean conseguiuTransferir = conta1.transfere(valorTransferencia[0], conta2);

            if (conseguiuTransferir){
                System.out.println("Saldo atualizado da conta da Conta1: " + conta1.getSaldo());
                System.out.println("Saldo atualizado da conta da Conta2: " + conta2.getSaldo());
            }

            // Simula 2ª transferência - Com saldo insuficiente
            System.out.println("Tenta transferir mais " + valorTransferencia[1] + " da Conta1 para a Conta2");
            conseguiuTransferir = conta1.transfere(valorTransferencia[1], conta2);

            if (conseguiuTransferir){
                System.out.println("Saldo atualizado da conta1: " + conta1.getSaldo());
                System.out.println("Saldo atualizado da conta2: " + conta2.getSaldo());
            }

             */
        }
    }
}