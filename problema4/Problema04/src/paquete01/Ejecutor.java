
package paquete01;

import paquete02.Cheque;

public class Ejecutor {

    public static void main(String[] args) {
        
        Cheque cheque01 = new Cheque();
        Cheque cheque02 = new Cheque("Maria", "Americas", 456486.33);
        
        cheque01.calcularComision();
        cheque02.calcularComision();
        
        System.out.printf("%s\n%s\n", cheque01, cheque02);
    }
    
}
