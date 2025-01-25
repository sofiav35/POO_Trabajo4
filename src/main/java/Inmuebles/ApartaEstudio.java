package Inmuebles;

public class ApartaEstudio extends Apartamento{
    protected static double valorArea = 1500000;

    public ApartaEstudio(int identificadorInmobiliario, int area, String direccion, int numH, int numB) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }

    public static double getValorArea() {
        return valorArea;
    }
      
}
