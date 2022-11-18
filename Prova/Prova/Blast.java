package Prova;


public class Blast extends Weapon{

    public Blast() {
    }
    
    public void shot() {
        
    }

    public Blast (String descricao, int dano){
        System.out.println("Um blast" + descricao);
        System.out.println("Dano: " + dano);
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