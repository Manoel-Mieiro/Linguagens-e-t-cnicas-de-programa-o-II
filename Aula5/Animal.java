package Aula5;
 
import java.util.Date;

public class Animal {
      private String nome;
      private String raca;
      private String porte;
      private String tipo;
      private float peso;
      private Date dataNasc;
      private String sexo;

      //Construct
      public Animal() {}
        //Construct overflow
      public Animal(String nome, String raca, String porte, String tipo, Float peso/*, Date dataNasc*/, String sexo) {
              this.nome = nome;
              this.raca = raca;
              this.porte = porte;
              this.tipo = tipo;
              this.peso = peso;
              //this.dataNasc = dataNasc;
              this.sexo = sexo;
      }
      


void Pet (){
        System.out.println("Ficha do PET: ");     
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Porte: " + porte);
        System.out.println("Tipo: " + tipo);
        System.out.println("Peso: " + peso);
        System.out.println("Nascimento: " + dataNasc);
        System.out.println("Sexo: " + sexo);
}       
        public String getNome(){
                return this.nome;
        }
        public void setNome(String nome) {
                this.nome = nome;
        }
        public String getRaca(){
                return this.raca;
        }
        public void setRaca(String nome) {
                this.raca = raca;
        }
        public String getPorte(){
                return this.porte;
        }
        public void setPorte(String porte) {
                this.porte = porte;
        }
        public String getTipo(){
                return this.tipo;
        }
        public void setTipo(String tipo) {
                this.tipo = tipo;
        }
                
        public Float getPeso(){
                return this.peso;
        }
        public void setPeso(Float peso) {
                this.peso = peso;
        }
       /*
        public Float getDate(){
                return this.dataNasc;
        }
        public void setDate(Float dataNasc) {
                this.dataNasc = dataNasc;
        }
        */
        public String getSexo(){
                return this.sexo;
        }
        public void setSexo(String sexo) {
                this.sexo = sexo;
        }
}
