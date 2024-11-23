package roda_conversa;

import java.util.*;

public class Evento {
    private int id;
    private Date data;
    private int duracao;
    private String local;
    private List<Assunto> assuntos = new ArrayList<>();
    private Mediador mediador;
    private Tema tema;
    private List<Convidado> convidados = new ArrayList<>();

    public Evento(Date data, int duracao, String local) {
        this.data = data;
        this.duracao = duracao;
        this.local = local;
    }

    // Método para informar o local do evento
    public void informarLocal(String local) {
        this.local = local;
    }

    // Método para inserir um assunto no evento
    public boolean inserirAssunto(Assunto assunto) {
        if (!assuntos.contains(assunto)) {
            assuntos.add(assunto);
            return true;
        }
        return false;
    }

    // Método para remover um assunto do evento
    public boolean removerAssunto(Assunto assunto) {
        return assuntos.remove(assunto);
    }

    // Método para registrar um mediador para o evento
    public void registrarMediador(Mediador mediador) {
        this.mediador = mediador;
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
        return "\ndata: " + data + "\nduracao: " + duracao + "\nlocal: " + local + "\nmediador: " + mediador
                + "\nassuntos: " + assuntos;
    }

    public List<Assunto> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List<Assunto> assuntos) {
        this.assuntos = assuntos;
    }

    public Mediador getMediador() {
        return mediador;
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados) {
        this.convidados = convidados;
    }
}
