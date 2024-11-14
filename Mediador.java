package roda_conversa;

public class Mediador extends Pessoa {
    private String cpf;

    public Mediador(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\ncpf=" + cpf;
    }
}
