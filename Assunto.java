package roda_conversa;

public class Assunto {
    private int id;
    private String descricao;

    public Assunto(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\ndescricao: " + descricao;
    }

}
