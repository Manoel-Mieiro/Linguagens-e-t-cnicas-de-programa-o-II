package Lista;

public class Triangulo {
 private int L1;
 private int L2;

 public int perimetro (int L1, int L2){
    return ((2*L1) + (2*L2));
 }
 int area (int L1, int L2){
 return (L1*L2);
}

public int getL1() {
    return L1;
}
public void setL1(int L1) {
    L1 = L1;
}
public int getL2() {
    return L2;
}
public void setL2(int L2) {
    L2 = L2;
}

    void imprime (){
    System.out.println("Lado maior: " + L1);
    System.out.println("Lado menor: " + L2);
    //System.out.printLn("Eis o perímetro:    " + perimetro(L2, L2));
    
}


}