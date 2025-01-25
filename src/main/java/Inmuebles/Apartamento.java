package Inmuebles;

public class Apartamento extends InmuebleVivienda{
    
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numH, int numB) {
        super(identificadorInmobiliario, area, direccion, numH, numB);
    }
    
    @Override
    void imprimir() {
        super.imprimir(); 
    }
}
