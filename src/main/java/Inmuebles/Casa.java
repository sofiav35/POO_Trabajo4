package Inmuebles;

public class Casa extends InmuebleVivienda {
    protected int numPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion, int numH, int numB, int numPisos) {
        super(identificadorInmobiliario, area, direccion, numH, numB);
        this.numPisos=numPisos;
    }
    
    @Override
    void imprimir() {
        super.imprimir(); 
        System.out.println("Número de pisos = " + numPisos);
    }
}
