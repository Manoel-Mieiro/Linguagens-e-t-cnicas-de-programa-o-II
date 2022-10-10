package Aula3;

public class Pessoa {
        String nome;
        String telefone;
        String   cpf;
        Endereço ad1;
        Animal ani1;
        void dados_pessoais (){
                System.out.println("Nome: " + this.nome);
                System.out.println("Telefone: " + this.telefone);
                System.out.println("cpf: " + this.cpf);
        }
        void valida (){
                int newCPF[11], count = 10, contvali =0, fst = 0, sec = 0, i=0;
                int len = cpf.length();
                System.out.println(len);
                for (i = 0; i<(len-2); i++){
                        newCPF[i] = cpf.charAt(i);
                        fst = fst + (newCPF[i]*count);
                        count --;
                }
                        fst = (fst*10)%11;
                        if ((fst == 10) && (fst == cpf.charAt(len-1)) || (fst == cpf.charAt(len-1))){
                                contvali ++;                      
                        }

                count = 11;        
                for (i = 0; i<(len-1);i++){
                        newCPF[len-1] = cpf.charAt(len-1);
                        sec = sec + (newCPF[i]*count);
                        count --;
                }
                sec = (sec*100)%11;
                        if ((sec == 10) && (sec == cpf.charAt(len)) || (sec == cpf.charAt(len))){
                                contvali ++;                      
                }
                if (contvali != 2){
                        System.out.println("CPF inválido!");
                }
        }

}