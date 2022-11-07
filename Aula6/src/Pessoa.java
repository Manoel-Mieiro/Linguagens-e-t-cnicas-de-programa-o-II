package Aula6;

public class Pessoa {
        private String nome;
        private String telefone;
        //private String   cpf;
        Endereço ad1;
        private Animal ani1;
        
        //Construct
        public Pessoa() {}
        //Construct overflow    
        public Pessoa(String nome, String telefone/*, String cpf, Endereço ad1, Animal ani1*/) {
                this.nome = nome;
                this.telefone = telefone;
                //this.cpf = cpf;
                //this.ad1 = ad1;
                //this.ani1 = ani1;
                
                
        }
        
        
        
        
        
        /*
        //Sobrecarga de método:
        public String dataPessoa (String nome){
        this.nome = nome;
        return nome;
        }
        */

       public void dados_pessoais (){
                System.out.println("Nome: " + this.nome);
                System.out.println("Telefone: " + this.telefone);
                //System.out.println("cpf: " + this.cpf);
        }
        public String getNome(){
                return this.nome;
        }
        public void setNome(String nome) {
                this.nome = nome;
        }
        public String getTelefone(){
                return this.telefone;
        }
        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }
        public String getCpf(){
                return this.cpf;
        }
        public void setCpf(String cpf) {
                this.cpf = cpf;
        }
        /*void valida (){
                int newCPF[11], count = 10, contvali =0, fst = 0, sec = 0, i=0;
                int len = cpf.length();
                System.out.println(len);
                for (i = 0; i<(len-2); i++){
                        newCPF[i] = cpf.charAt(i);
                        fst = fst + (newCPF[i]*count);
                        count --;
                }
                        fst = 11 - ((fst*10)%11);
                        if ((fst == 10) && (fst == cpf.charAt(len-1)) || (fst == cpf.charAt(len-1))){
                                contvali ++;                      
                        }

                count = 11;        
                for (i = 0; i<(len-1);i++){
                        newCPF[len-1] = cpf.charAt(len-1);
                        sec = sec + (newCPF[i]*count);
                        count --;
                }
                sec = 11 - ((sec*100)%11);
                        if ((sec == 10) && (sec == cpf.charAt(len)) || (sec == cpf.charAt(len))){
                                contvali ++;                      
                }
                if (contvali != 2){
                        System.out.println("CPF inválido!");
                }
        }*/



}       