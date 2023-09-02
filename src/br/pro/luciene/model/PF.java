package br.pro.luciene.model;
public class PF extends Pessoa{
    private String rg;
    private String cpf;
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public PF() {
        super();
        rg = new String();
        cpf = new String();
    }
    public PF(int id, String nome, String email, String senha, String rg, String cpf) {
        super(id, nome, email, senha);
        this.rg = rg;
        this.cpf = cpf;
    }

}
