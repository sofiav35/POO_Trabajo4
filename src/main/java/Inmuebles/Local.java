package Inmuebles;

public class Local extends Inmueble{
    protected enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal;

    public Local(tipo tipoLocal, int identificadorInmobiliario, int area, String direccion) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
    
}
