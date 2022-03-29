// Uma interface é uma espécie de contrato, onde quem utiliza esse contrato,
// precisa implementar os métodos existentes (setSenha, autentica...)
public abstract interface Autenticacao {
    public abstract void setSenha(int Senha);
    public abstract boolean autentica(int senha);
}
