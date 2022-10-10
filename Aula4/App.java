package Aula3;
//import Aula.Animal;

public class App {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        /* 
        p1.nome = "Manoel";
        p1.cpf = "17733635730";
        p1.telefone = "969785489";
        */
        p1.getNome();
        p1.setNome("Manoel");
        p1.getCpf();
        p1.setCpf("17733635730");
        p1.getTelefone();
        p1.setTelefone("969785489");
        p1.dados_pessoais();
        //p1.valida();
        System.out.println("-------------------------------------------------------------------------");
        
        Endereço e1 = new Endereço();
        p1.ad1 = e1;
        /*
        e1.rua = "Rua de Lazer";
        e1.numero = 159;
        e1.complemento = "Bl 7, apt 101";
        e1.bairro = "Pilares";
        e1.cidade = "Rio de Janeiro";
        e1.cep = "20760-230";
        */
        e1.getRua();
        e1.setRua("Rua de Lazer");
        e1.getNumero();
        e1.setNumero(159);
        e1.getComplemento();
        e1.setComplemento("Bl 7, apt 101");
        e1.getBairro();
        e1.setBairro("Pilares");
        e1.getCidade();
        e1.setCidade("Rio de Janeiro");
        e1.getCep();
        e1.setCep("20760-230");
        e1.lugar();
        Animal a1 = new Animal();
        /* 
        p1.ani1 = a1;
        a1.nome = "Bryan";
        a1.raca = "Calopsita";
        a1.porte = "Pequeno";
        a1.tipo = "Ave";
        a1.peso = 0.4f;
        a1.sexo = "Feminino";
        */
        System.out.println("-------------------------------------------------------------------------");
        
        a1.getNome();
        a1.setNome("Bryan");
        a1.getRaca();
        a1.setRaca("Calopsita");
        a1.getPorte();
        a1.setPorte("Pequeno");
        a1.getTipo();
        a1.setTipo("Ave");
        a1.getPeso();
        a1.setPeso(0.4f);
  
        
        a1.getSexo();
        a1.setSexo("Feminino");
        a1.Pet();
        
    }
}
