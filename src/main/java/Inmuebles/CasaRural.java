package Inmuebles;

public class CasaRural extends Casa{
    
    protected double distancia;
    protected double altura;
    protected static double valorArea = 1500000;
    
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numH, int numB, int numPisos, double distancia, double altura) {
        super(identificadorInmobiliario, area, direccion, numH, numB, numPisos);
        this.distancia=distancia;
        this.altura= altura;
    }
    
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("La distancia a la cabecera municipal es de "+distancia);
        System.out.println("La altura sobre el nivel del mar es: "+altura);
        System.out.println();
    }
    
}
