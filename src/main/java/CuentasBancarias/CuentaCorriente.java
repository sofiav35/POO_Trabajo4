package CuentasBancarias;

public class CuentaCorriente extends CuentaBancaria{
    
    float sobreGiro;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobreGiro=0;
    }
    
    @Override
    public void Retirar(float cantidad) {
        float resultado = saldo - cantidad; 
        if (resultado < 0) {
        sobreGiro = sobreGiro - resultado;
        saldo = 0;
        } 
        else {
        super.Retirar(cantidad);
        }
    }
    
    @Override
    public void Consignar(float cantidad) {
        float residuo = sobreGiro - cantidad;
        if (sobreGiro > 0) {
            if ( residuo > 0) { 
                sobreGiro = 0;
                saldo = residuo;
            } 
            else {
                sobreGiro = -residuo;
                saldo = 0;
            }
        } 
        else {
            super.Consignar(cantidad);
        }
    }
    
    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }
    
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comision);
        System.out.println("Número de transacciones = " +(numConsignaciones + numRetiros));
        System.out.println("Valor de sogregiro = $" +(numConsignaciones + numRetiros));
        System.out.println();
    }
        
}
    

