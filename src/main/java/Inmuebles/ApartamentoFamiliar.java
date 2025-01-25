package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected double valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numH, int numB, double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numH, numB);
        this.valorAdministracion = valorAdministracion;
    }
    
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración = $" +valorAdministracion);
        System.out.println();
    }
}

