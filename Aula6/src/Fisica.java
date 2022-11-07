package Aula6;
public class Fisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /*
    public Fisica (){

    }
     */

    public Fisica (String nome, String telefone, String cpf){
        super (nome, telefone);
        this.cpf = cpf;
    }

    public void dados_pessoais (){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("cpf: " + this.cpf);
    }
}
