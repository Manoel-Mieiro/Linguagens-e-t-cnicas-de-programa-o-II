package Prova;

//Saber herda comportamentos e características de Weapon
public class Saber extends Weapon{


   

    public Saber(String descricao, int dano) {
        super(descricao, dano);
    }

    /*
    //Argumentos herdados de Weapon
    public Saber(String descricao, int dano) {
        super(descricao, dano);
    }
    */
    //Método
    public void slash() {
     System.out.println("O sabre " + super.getDescricao() + " cortou o inimigo");   
    }


}