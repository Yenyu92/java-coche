
package open.bootcamp2;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.numeros_puertas);
    }
    
}

class Coche {
    public int numeros_puertas = 4;
    
    public void AumentarPuertas(){
        this.numeros_puertas++;
    }
          
}