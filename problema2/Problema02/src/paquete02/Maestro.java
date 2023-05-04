package paquete02;

public class Maestro {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Maestro(){   
        nombre = "Roberto";
        apellido = "Bustamante";
        sueldoBasico = 460.33;
        cedula = "110335689";
    
    }
    
    public Maestro(String nom, String ap, double sueldoB, String ced) {
        nombre = nom;
        apellido = ap;
        sueldoBasico = sueldoB;
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        double valorAdd = (sueldoBasico * 20)/100;
        sueldoTotal = sueldoBasico + valorAdd;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    @Override
    public String toString() {
        String m = String.format("\n\t---Maestro: %s %s---\n"
                + "\tNro. Cedula: %s\n"
                + "\tSueldo Basico: $%.2f\n"
                + "\tSueldo total: $%.2f\n",
                nombre,
                apellido,
                cedula,
                sueldoBasico,
                sueldoTotal);
        
        return m;
    }
    
    
    
    
}
