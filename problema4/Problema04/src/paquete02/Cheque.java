package paquete02;

public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Cheque() {
        nombreCliente = "Juan";
        nombreBanco = "Bolivariano";
        valorCheque = 3600.33;
    }

    public Cheque(String nomC, String nomB, double valC) {
        nombreCliente = nomC;
        nombreBanco = nomB;
        valorCheque = valC;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public void establecerNombreBanco(String c) {
        nombreBanco = c;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public void establecerValorCheque(double c) {
        valorCheque = c;
    }

    public double obtenerComision() {
        return comision;
    }

    public void calcularComision() {
        double valorAdd = (valorCheque * 0.003)/100;
        comision = valorCheque * valorAdd;
    }

    @Override
    public String toString() {
        String m = String.format("""
                                        Cheque --- Cliente: %s
                                 
                                 + Banco: %s
                                 + Valor: $%.2f
                                 + Comision: $%.2f
                                 
                                 """,
                nombreCliente,
                nombreBanco,
                valorCheque,
                comision);
        
        return m;
    }
    
    
    
    

}
