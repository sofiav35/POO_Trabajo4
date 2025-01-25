package CarreraCiclistica;

public class Escalador extends Ciclista{
    private double aceleracionPromedio;
    private double gradoRampa;
    
    public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public double getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public double getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + aceleracionPromedio);
        System.out.println("Grado de rampa = " + gradoRampa);
    }
    
    @Override
    protected String imprimirTipo() {
        return "Es un escalador";
    }
}
