package Prova;

//Blast herda comportamentos e características de Weapon
public class Blast extends Weapon{

    public Blast(String descricao, int dano) {
        super(descricao, dano);
    }

 
    
    public void shot() {
        System.out.println("Inimigo atingido pelo blast " + super.getDescricao());   
    }



/*
    public String getDescricao (){
        return super.getDescricao();

    }

    public void setDescricao (){
        super.setDescricao(getDescricao());
    }
        
    
    public int getDano (){
        return super.getDano();

    }

    public void setDano (){
        super.setDano(getDano());;
    }
 */

}