package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected double valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos, int identificadorInmobiliario, int area, String direccion, int numH, int numB, int numPisos) {
        super(identificadorInmobiliario, area, direccion, numH, numB, numPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de adminisración= "+ valorAdministracion);
        System.out.println("¿Tiene piscina?: "+tienePiscina);
        System.out.println("¿Tiene campos deportivos?: "+ tieneCamposDeportivos);
        System.out.println();
    }
    
    
    
    
}
