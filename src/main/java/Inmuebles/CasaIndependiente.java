package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numH, int numB, int numPisos) {
        super(identificadorInmobiliario, area, direccion, numH, numB, numPisos);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
    
}
