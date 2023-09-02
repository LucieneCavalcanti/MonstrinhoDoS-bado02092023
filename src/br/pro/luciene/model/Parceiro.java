package br.pro.luciene.model;

public class Parceiro extends PJ {
    private String servico;
    private String dataInicial;
    private String dataFinal;
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public String getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }
    public String getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
    public Parceiro(int id, String nome, String email, String senha, String cnpj, String ie, String servico,
            String dataInicial, String dataFinal) {
        super(id, nome, email, senha, cnpj, ie);
        this.servico = servico;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
    public Parceiro() {
        super();
        servico = new String();
        dataInicial = new String();
        dataFinal = new String();
    }
    
}
