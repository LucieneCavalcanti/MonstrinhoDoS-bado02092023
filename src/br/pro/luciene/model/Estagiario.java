package br.pro.luciene.model;
public class Estagiario extends Funcionario{
    private String curso;
    private String dataInicial;
    private String dataFinal;
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
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
    public Estagiario() {
        super();
        curso = new String();
        dataInicial = new String();
        dataFinal = new String();
    }
    public Estagiario(int id, String nome, String email, String senha, String rg, String cpf, String departamento,
            String curso, String dataInicial, String dataFinal) {
        super(id, nome, email, senha, rg, cpf, departamento);
        this.curso = curso;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
    
}
