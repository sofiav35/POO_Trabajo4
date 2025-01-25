package CarreraCiclistica;

public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;
    
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + velocidadMaxima);
    }

    @Override
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }   
}
