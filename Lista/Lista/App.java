package Lista;

public class App {
public static void main(String[] args) {
 
    Triangulo t1 = new Triangulo ();
    t1.getL1();
    t1.setL1(8);
    t1.getL2();
    t1.setL2(4);
    t1.imprime();
    System.out.println("Perímetro:  " + t1.perimetro(8, 4));
    System.out.println("Área:   " + t1.area(8, 4));

    Triangulo t2 = new Triangulo ();
    t2.getL1();
    t2.setL1(10);
    t2.getL2();
    t2.setL2(9);
    System.out.println("Perímetro: " + t2.perimetro(10, 9));
    System.out.println("Área: " + t2.area(10, 9));

    Triangulo t3 = new Triangulo ();
    t3.getL1();
    t3.setL1(33);
    t3.getL2();
    t3.setL2(10);
    System.out.println("Perímetro: " + t3.perimetro(33, 10));
    System.out.println("Área: " + t3.area(33, 10));

}
}