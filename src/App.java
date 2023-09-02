import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.pro.luciene.model.CLT;
import br.pro.luciene.model.Cliente;
import br.pro.luciene.model.Contrato;
import br.pro.luciene.model.Estagiario;
import br.pro.luciene.model.Fornecedor;
import br.pro.luciene.model.Funcionario;
import br.pro.luciene.model.PF;
import br.pro.luciene.model.Parceiro;
import br.pro.luciene.model.Pessoa;

public class App {
    //armazenamento dos objetos
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Estagiario> listaEstagiarios = new ArrayList<>();
    ArrayList<CLT> listaCLT = new ArrayList<>();
    ArrayList<Contrato> listaContratos = new ArrayList<>();
    ArrayList<Parceiro> listaParceiros = new ArrayList<>();
    ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "1 - Cadastrar Cliente\n"+
            "2 - Cadastrar Estagiário\n"+
            "3 - Cadastrar Funcionário CLT\n"+
            "4 - Cadastrar Funcionário Contrato\n"+
            "5 - Cadastrar Fornecedor\n"+
            "6 - Cadastrar Parceiro\n"+
            "--------------------------------------\n"+
            "7  - Listar Cliente\n"+
            "8  - Listar Estagiário\n"+
            "9  - Listar Funcionário CLT\n"+
            "10 - Listar Funcionário Contrato\n"+
            "11 - Listar Fornecedor\n"+
            "12 - Listar Parceiro\n"+
            "--------------------------------------\n"+
            "20 - Sair"));
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarEstagiario();
                    break;
                case 3:
                    //cadastrarFuncionarioCLT();
                    break;
                case 4:
                    //cadastrarFuncionarioContrato();
                    break;
                case 5:
                    //cadastrarFornecedor();
                    break;
                case 6:
                    //cadastrarParceiro();
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 20:
                    
                    break;
                
                default: JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao!=20);
    }
    private static void cadastrarCliente(){
        Cliente objCliente = new Cliente();
        cadastrarPF(objCliente);
 
        do {
            objCliente.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Digite o Limite")));
        } while (objCliente.getLimite()<=0);
        JOptionPane.showMessageDialog(null, objCliente.getNome());
        listaClientes.add(objCliente);
    }
    private static void cadastrarEstagiario(){
        Estagiario objEstagiario = new Estagiario();
        cadastrarFuncionario(objEstagiario);
        do {
            objEstagiario.setCurso(JOptionPane.showInputDialog("Digite o curso"));
        } while (objEstagiario.getCurso().length()<3);
        do {
            objEstagiario.setDataInicial(JOptionPane.showInputDialog("Digite a data Inicial"));
        } while (objEstagiario.getDataInicial().length()!=10);
        do {
            objEstagiario.setDataFinal(JOptionPane.showInputDialog("Digite a data Final"));
        } while (objEstagiario.getDataFinal().length()!=10);
        listaEstagiarios.add(objEstagiario);
    }
    private static void cadastrarFuncionario(Funcionario obj) {
        cadastrarPF(obj);
        do {
            obj.setDepartamento(JOptionPane.showInputDialog("Digite o departamento"));
        } while (obj.getDepartamento().length()<5);
    }
    private static void cadastrarPessoa(Pessoa obj){
        do {
            obj.setId(Integer.parseInt(
                JOptionPane.showInputDialog("Digite o ID")));
        } while (obj.getId()<=0);
        do {
            obj.setNome(JOptionPane.showInputDialog("Digite o Nome"));
        } while (obj.getNome().length()<3);
        do {
            obj.setEmail(JOptionPane.showInputDialog("Digite o E-mail"));
        } while (obj.getEmail().length()<=6);
        do {
            obj.setSenha(JOptionPane.showInputDialog("Digite a senha"));
        } while (obj.getSenha().length()<5 || 
                obj.getSenha().length()>20);
        
    }
    private static void cadastrarPF(PF obj){
        cadastrarPessoa(obj);
        do {
            obj.setCpf(JOptionPane.showInputDialog("Digite o CPF"));
        } while (obj.getCpf().length()!=14);
        do {
            obj.setRg(JOptionPane.showInputDialog("Digite o E-mail"));
        } while (obj.getRg().length()<=8);
    }
}
