public class TestaReferencias {
    public static void main(String[] args) {
        double bonificacao;

        ControleBonificacao controle = new ControleBonificacao();

        Gerente gerente = new Gerente();
        gerente.setNome("Paulo Roberto Costa");
        gerente.setCpf("458.345.345-55");
        gerente.setSalario(10000.0);

        gerente.setSenha(2222);

        boolean autenticou = gerente.autentica(2222);

        if (autenticou) {
            System.out.println("Funcionario: " + gerente.getNome());
            System.out.println("        CPF: " + gerente.getCpf());
            System.out.println("    Salario: " + gerente.getSalario());
            bonificacao = controle.registra(gerente);
            System.out.println("Bonificação: " + bonificacao);
            System.out.println("Sal.Liquido: " + gerente.getSalarioLiquido(bonificacao));
        }

        EditorDeVideo editor = new EditorDeVideo();

        editor.setNome("João da Silva");
        editor.setCpf("010.124.445-77");
        editor.setSalario(1000.0);

        System.out.println("Funcionario: " + editor.getNome());
        System.out.println("        CPF: " + editor.getCpf());
        System.out.println("    Salario: " + editor.getSalario());
        bonificacao = controle.registra(editor);
        System.out.println("Bonificação: " + bonificacao);
        System.out.println("Sal.Liquido: " + editor.getSalarioLiquido(bonificacao));

        Desinger d = new Desinger();

        d.setNome("Ricardo Vallentim Ribeiro do Amaral");
        d.setCpf("567.421.544-54");
        d.setSalario(1500.0);

        System.out.println("Funcionario: " + d.getNome());
        System.out.println("        CPF: " + d.getCpf());
        System.out.println("    Salario: " + d.getSalario());
        bonificacao = controle.registra(d);
        System.out.println("Bonificação: " + bonificacao);
        System.out.println("Sal.Liquido: " + editor.getSalarioLiquido(bonificacao));
    }
}
