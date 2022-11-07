package Aula6;

public class Juridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Juridica (){
    }
     
    
    public Juridica (String nome, String telefone, String cnpj){
        super(nome, telefone);
        this.cnpj = cnpj;
    }
    public void dados_pessoais (){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("cnpj: " + this.cnpj);
}

}
