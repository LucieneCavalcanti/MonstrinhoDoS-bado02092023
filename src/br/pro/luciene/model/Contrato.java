package br.pro.luciene.model;
public class Contrato extends Funcionario{
    private String numeroContrato;

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Contrato() {
        super();
        numeroContrato = new String();
    }

    public Contrato(int id, String nome, String email, String senha, String rg, String cpf, String departamento,
            String numeroContrato) {
        super(id, nome, email, senha, rg, cpf, departamento);
        this.numeroContrato = numeroContrato;
    }
    
}
