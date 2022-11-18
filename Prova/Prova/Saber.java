package Prova;

public class Saber extends Weapon{

    public Saber() {
    }

    public Saber (String descricao, int dano)    {
        System.out.println("Um sabre de luz " + descricao);
        System.out.println("Dano: " + dano);
    }

    public void slash() {
        
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