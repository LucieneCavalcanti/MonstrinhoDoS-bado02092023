package br.pro.luciene.model;
public class CLT extends Funcionario {
    private String ctps;

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public CLT() {
        super();
        ctps = new String();
    }

    public CLT(int id, String nome, String email, String senha, String rg, String cpf, String departamento,
            String ctps) {
        super(id, nome, email, senha, rg, cpf, departamento);
        this.ctps = ctps;
    }

}
