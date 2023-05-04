package paquete01;

import paquete02.Estudiante;

public class Ejecutor {

    public static void main(String[] args) {
        
        Estudiante estudiante01 = new Estudiante();
        Estudiante estudiante02 = new Estudiante("Luis", 10, 9.5, 7);
        
        estudiante01.calcularPromedio();
        estudiante02.calcularPromedio();
        
        System.out.printf("%s\n%s\n", estudiante01, estudiante02);
    }
    
}
