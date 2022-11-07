package Aula6;

public class Endereço {
        private String rua;
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String cep;

        public Endereço() {}

      public Endereço(String rua, int numero, String complemento, String bairro, String cidade, String cep) {
              this.rua = rua;
              this.complemento = complemento;
              this.bairro = bairro;
              this.cidade = cidade;
              this.cep = cep;
      }

void lugar (){
        System.out.println("Address: " + this.rua + " - " + this.numero + ", " + this.complemento + " (" + this.bairro + ", " + this.cidade + ")");
        System.out.println("CEP: " + this.cep);
}
public String getRua(){
        return this.rua;
}
public void setRua(String rua) {
        this.rua = rua;
}
public int getNumero(){
        return this.numero;
}
public void setNumero(int numero) {
        this.numero = numero;
}
public String getComplemento(){
        return this.complemento;
}
public void setComplemento(String complemento) {
        this.complemento = complemento;
}
public String getBairro(){
        return this.bairro;
}
public void setBairro(String bairro) {
        this.bairro = bairro;
}

public String getCidade(){
        return this.cidade;
}
public void setCidade(String cidade) {
        this.cidade = cidade;
}
public String getCep(){
        return this.cep;
}
public void setCep(String cep) {
        this.cep = cep;
}
}