package Prova;


public class App {
public static void main(String[] args) {
    
    
    Pessoa p1 = new Pessoa();
    p1.getNome();
    p1.setNome("Leia");
    p1.getSobrenome();
    p1.setSobrenome("Organa");
    p1.getSexo();
    p1.setSexo("Feminino");
    p1.imprime();
    //sobrescrevendo
    p1 = new Pessoa("Luke", "Skywalker", "Masculino");
    p1.imprime();
    Jedi j1 = new Jedi();
    j1.mindControl();
    Sith s1 = new Sith();
    s1.telepath();
    Jedi j2 = new Jedi("Obi-Wan", "Kenobi", null);
    j2.imprime();
    j2.mindControl(null);
    j2.mindControl();
    j2.levitation();
    Sith s2 = new Sith("Darth", "Vader", null);
    s2.imprime();
    s2.levitation(null);
    s2.mindControl();
    s2.levitation();
    //Weapon w1 = new Weapon("azuk", 0);
    Saber sb1 = new Saber("azul", 0);
    sb1.slash();
    Saber sb2 = new Saber("vermelho", 0);
    sb2.slash();
    Blast b1 = new Blast("laser", 0);
    b1.shot();

    

  
    

}

}