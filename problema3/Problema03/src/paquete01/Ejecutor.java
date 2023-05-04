package paquete01;

import paquete02.Automotor;

public class Ejecutor {

    public static void main(String[] args) {
        
        Automotor auto01 = new Automotor();
        Automotor auto02 = new Automotor("89564k01d", "Hyundai", 1989, 23500.2);
        
        auto01.calcularValorMatricula();
        auto02.calcularValorMatricula();
        
        System.out.printf("%s\n%s\n", auto01, auto02);
    }
    
}
