package paquete01;

import paquete02.Maestro;


public class Ejecutor {

    public static void main(String[] args) {
        
        Maestro maestro01 = new Maestro();
        Maestro maestro02 = new Maestro("Oliver", "Saraguro", 145.33, "1104687");
        
        maestro01.calcularSueldoTotal();
        maestro02.calcularSueldoTotal();
        
        System.out.printf("%s\n%s\n", maestro01, maestro02);
    }
    
}
