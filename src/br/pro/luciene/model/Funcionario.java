package br.pro.luciene.model;
public class Funcionario extends PF{
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario() {
        super();
        departamento = new String();
    }

    public Funcionario(int id, String nome, String email, String senha, String rg, String cpf, String departamento) {
        super(id, nome, email, senha, rg, cpf);
        this.departamento = departamento;
    }
    
}
