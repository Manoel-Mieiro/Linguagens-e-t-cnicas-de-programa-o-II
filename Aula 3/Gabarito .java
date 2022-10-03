https://campuscode.com.br/conteudos/o-calculo-do-digito-verificador-do-cpf-e-do-cnpj

public class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Pessoa(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    private boolean validarCPF(String cpf){
        char verifica[] = this.cpf.toCharArray();
        int resultado = (10*Character.getNumericValue(verifica[0]))+
            (9*Character.getNumericValue(verifica[1]))+
            (8*Character.getNumericValue(verifica[2]))+
            (7*Character.getNumericValue(verifica[3]))+
            (6*Character.getNumericValue(verifica[4]))+
            (5*Character.getNumericValue(verifica[5]))+
            (4*Character.getNumericValue(verifica[6]))+
            (3*Character.getNumericValue(verifica[7]))+
            (2*Character.getNumericValue(verifica[8]));
        int verificador1 = 11 - (resultado % 11);
        resultado = (11*Character.getNumericValue(verifica[0]))+
            (10*Character.getNumericValue(verifica[1]))+
            (9*Character.getNumericValue(verifica[2]))+
            (8*Character.getNumericValue(verifica[3]))+
            (7*Character.getNumericValue(verifica[4]))+
            (6*Character.getNumericValue(verifica[5]))+
            (5*Character.getNumericValue(verifica[6]))+
            (4*Character.getNumericValue(verifica[7]))+
            (3*Character.getNumericValue(verifica[8]))+
            (2*Character.getNumericValue(verifica[9]));
        int verificador2 = 11 - (resultado % 11);
        
        if(verificador1==Character.getNumericValue(verifica[9])&&verificador2==Character.getNumericValue(verifica[10])){
            return true;
        }else{
            return false;
        }
    }

    public void valida(){
        if(this.validarCPF(cpf)){
            System.out.println("CPF válido.");
        }else{
            System.out.println("CPF inválido.");
        }
    }
    public String getCpf() {
        return cpf;
    }
    
}
