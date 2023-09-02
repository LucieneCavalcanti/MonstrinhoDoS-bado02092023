package br.pro.luciene.model;

public class Fornecedor extends PJ{
    String site;
    String representante;
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public String getRepresentante() {
        return representante;
    }
    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    public Fornecedor() {
        super();
        site = new String();
        representante = new String();
    }
    public Fornecedor(int id, String nome, String email, String senha, String cnpj, String ie, String site,
            String representante) {
        super(id, nome, email, senha, cnpj, ie);
        this.site = site;
        this.representante = representante;
    }
    
}
