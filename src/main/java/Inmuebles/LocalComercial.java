package Inmuebles;

public class LocalComercial extends Local{
    protected static double valorArea = 3000000;
    protected String centroComercial;

    public LocalComercial(String centroComercial, tipo tipoLocal, int identificadorInmobiliario, int area, String direccion) {
        super(tipoLocal, identificadorInmobiliario, area, direccion);
        this.centroComercial = centroComercial;
    }
    
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
    
}
