package Prova;

public class Jedi extends Pessoa implements Force{
private String titulo;
//private String weapons;




public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

/*
public String getWeapons() {
    return weapons;
}

public void setWeapons(String weapons) {
    this.weapons = weapons;
}
 */

public Jedi (){
        
}

    public Jedi(String nome, String sobrenome, String titulo/*, String weapons */) {
        super(nome, sobrenome);
        this.titulo = titulo;
        //this.weapons = weapons;
        
    }

public void imprime (){
    System.out.println(super.getNome() + " " + super.getSobrenome());
    System.out.println("Titulo: " + titulo);
    //System.out.println("Weapons: " + weapons);
}

@Override
public void mindControl() {
    System.out.println("[Jedi]: Controle mental ativado");
    
}

public void mindControl (String Do){
    Do = "Do what I wish";
    System.out.println(Do);
}

@Override
public void farseeing() {
    System.out.println("[Jedi]: Visão amplificada");
    
}

@Override
public void telepath() {
    System.out.println("[Jedi]: Telepatia ativada");
    
}

@Override
public void levitation() {
    System.out.println("[Jedi]: Levitação ativada");
    
}


public void patience (){   
} 
}