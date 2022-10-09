package Aula3;

public class Endereço {
        String rua;
        int numero;
        String complemento;
        String bairro;
        String cidade;
        String cep;

void lugar (){
        System.out.println("Address: " + this.rua + " - " + this.numero + ", " + this.complemento + " (" + this.bairro + ", " + this.cidade + ")");
        System.out.println("CEP: " + this.cep);
}
}