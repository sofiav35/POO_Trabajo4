package Inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numH, int numB) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones= numH;
        this.numeroBaños=numB;
        
    }
    
    @Override
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones ="+ numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBaños);
    }
}

