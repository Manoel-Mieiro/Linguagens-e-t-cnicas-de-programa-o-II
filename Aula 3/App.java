package Aula3;
//import Aula.Animal;

public class App {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Manoel";
        p1.cpf = "17733635730";
        p1.telefone = "969785489";
        p1.dados_pessoais();
        p1.valida();
        System.out.println("-------------------------------------------------------------------------");
        
        Endereço e1 = new Endereço();
        p1.ad1 = e1;
        e1.rua = "Rua de Lazer";
        e1.numero = 159;
        e1.complemento = "Bl 7, apt 101";
        e1.bairro = "Pilares";
        e1.cidade = "Rio de Janeiro";
        e1.cep = "20760-230";
        e1.lugar();

        Animal a1 = new Animal();
        p1.ani1 = a1;
        a1.nome = "Bryan";
        a1.raca = "Calopsita";
        a1.porte = "Pequeno";
        a1.tipo = "Ave";
        a1.peso = 0.4f;
        a1.sexo = "Feminino";
        System.out.println("-------------------------------------------------------------------------");
        a1.Pet();
    }
}
