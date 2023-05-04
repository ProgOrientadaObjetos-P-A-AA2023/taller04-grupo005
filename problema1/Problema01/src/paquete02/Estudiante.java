package paquete02;

public class Estudiante {
    
    private String nombre;
    private double calMateria01;
    private double calMateria02;
    private double calMateria03;
    private double promedio;
    
    public Estudiante(){
        nombre = "Denis";
        calMateria01 = 8.5;
        calMateria02 = 5.2;
        calMateria03 = 10;
    }

    public Estudiante(String nom, double m1, double m2, double m3) {
        nombre = nom;
        calMateria01 = m1;
        calMateria02 = m2;
        calMateria03 = m3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public double obtenerCalMateria01() {
        return calMateria01;
    }

    public void establecerCalMateria01(double m) {
        calMateria01 = m;
    }

    public double obtenerCalMateria02() {
        return calMateria02;
    }

    public void establecerCalMateria02(double m) {
        calMateria02 = m;
    }

    public double obtenerCalMateria03() {
        return calMateria03;
    }

    public void establecerCalMateria03(double m) {
        calMateria03 = m;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        promedio = (calMateria01 + calMateria02 + calMateria03)/3;
    }

    @Override
    public String toString() {
        String m = String.format("\n---Estudiante: %s---\n"
                + "Calificacion materia 01: %.2f\n"
                + "Calificacion materia 02: %.2f\n"
                + "Calificacion materia 03: %.2f\n"
                + "Promedio: %.2f\n",
                nombre,
                calMateria01,
                calMateria02,
                calMateria03,
                promedio);
        
        return m;
    }
    
    
    
    
}
