package br.pro.luciene.model;
public class Cliente extends PF{
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente() {
        super(); //sempre tem que ser a primeira linha
        limite = 10.5f;
    }

    public Cliente(int id, String nome, String email, String senha, String rg, String cpf, float limite) {
        super(id, nome, email, senha, rg, cpf);
        this.limite = limite;
    }
    
}
