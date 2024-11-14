package roda_conversa;

import java.util.*;

public class Evento {
    private int id;
    private Date data;
    private int duracao;
    private String local;

    public Evento(Date data, int duracao, String local) {
        this.data = data;
        this.duracao = duracao;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "\ndata: " + data + "\nduracao: " + duracao + "\nlocal: " + local;
    }
}
