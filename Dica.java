package roda_conversa;

public class Dica {
    private int id;
    private String descricao;

    public Dica(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // Método para registrar uma dica com uma nova descrição
    public void registrarDica(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao;
    }
}
