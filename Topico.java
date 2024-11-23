package roda_conversa;

public class Topico {
    private int id;
    private String descricao;

    public Topico(int id, String descricao) {
        this.id = id;
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
