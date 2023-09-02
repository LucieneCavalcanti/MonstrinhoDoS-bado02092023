package br.pro.luciene.model;
public class PJ extends Pessoa {
    private String cnpj;
    private String ie;
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getIe() {
        return ie;
    }
    public void setIe(String ie) {
        this.ie = ie;
    }
    public PJ() {
        super(); //<-chamar o construtor Pessoa()
        cnpj = new String();
        ie = new String();
    }
    public PJ(int id, String nome, String email, String senha,
    String cnpj, String ie) {
        super(id, nome, email, senha);
        this.cnpj = cnpj;
        this.ie = ie;
    }

}
