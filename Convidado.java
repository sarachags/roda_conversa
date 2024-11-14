package roda_conversa;

public class Convidado extends Pessoa {
    private String funcao;
    private String redeSocial;
    private String formacao;
    private String maiorTitulacao;
    private String detalheProfissional;

    public Convidado(String nome, String funcao, String redeSocial, String formacao, String maiorTitulacao,
            String detalheProfissional) {
        super(nome);
        this.funcao = funcao;
        this.redeSocial = redeSocial;
        this.formacao = formacao;
        this.maiorTitulacao = maiorTitulacao;
        this.detalheProfissional = detalheProfissional;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getMaiorTitulacao() {
        return maiorTitulacao;
    }

    public void setMaiorTitulacao(String maiorTitulacao) {
        this.maiorTitulacao = maiorTitulacao;
    }

    public String getDetalheProfissional() {
        return detalheProfissional;
    }

    public void setDetalheProfissional(String detalheProfissional) {
        this.detalheProfissional = detalheProfissional;
    }

    @Override
    public String toString() {
        return "\nfuncao=" + funcao + "\nredeSocial=" + redeSocial + "\nformacao=" + formacao + "\nmaiorTitulacao="
                + maiorTitulacao + "\ndetalheProfissional=" + detalheProfissional;
    }
}
