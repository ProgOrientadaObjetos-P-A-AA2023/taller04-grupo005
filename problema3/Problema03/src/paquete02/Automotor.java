package paquete02;

public class Automotor {

    private String cedPropietario;
    private String marca;
    private int anioFab;
    private double valor;
    private double valorMatricula;

    public Automotor() {
        cedPropietario = "456ab789";
        marca = "Audi";
        anioFab = 2022;
        valor = 123000.56;
    }

    public Automotor(String cedulaP, String mar, int anioF, double val) {

        cedPropietario = cedulaP;
        marca = mar;
        anioFab = anioF;
        valor = val;
    }

    public String obtenerCedPropietario() {
        return cedPropietario;
    }

    public void establecerCedPropietario(String a) {
        cedPropietario = a;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String a) {
        marca = a;
    }

    public int obtenerAnioFab() {
        return anioFab;
    }

    public void establecerAnioFab(int a) {
        anioFab = a;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor(double a) {
        valor = a;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        double valorAdd = (valor * 0.002) / 100;
        int antiguedad = 2023 - anioFab;
        
        valorMatricula = valorAdd * antiguedad;
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 Vehiculo:
                                 *------------------------------------*
                                 | Marca: %s
                                 | Cedula Propietario: %s
                                 | Año Fabricacion: %d
                                 | Valor: $%.2f
                                 | Valor Matricula: $%.2f
                                 *------------------------------------*
                                 """,
                marca,
                cedPropietario,
                anioFab,
                valor,
                valorMatricula);
        
        return m;
    }
    
    

}
