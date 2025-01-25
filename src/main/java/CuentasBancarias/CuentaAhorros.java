package CuentasBancarias;

public class CuentaAhorros extends CuentaBancaria{
    
    private boolean activa;
    
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        activa= saldo>=10000;
    }
    
    @Override
    public void Retirar(float cantidad) {
        if (activa){ 
           super.Retirar(cantidad);
         }
        
        else{
            System.out.println("La cuenta esta inactiva, no se puede retirar");
        }
    }
    
    @Override
    public void Consignar(float cantidad){
        if(activa){
            super.Consignar(cantidad);
        }
        else{
            System.out.println("La cuenta esta inactiva, no se puede consignar");
        }
        
    }
    
    @Override
    public void extractoMensual(){
        if (numRetiros>4 ){
            comision += (numRetiros-4)*1000;
        }
    super.extractoMensual();
    
    if ( saldo < 10000 ){
        activa = false;
        }
    }
    
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " +comision);
        System.out.println("Número de transacciones = " +(numConsignaciones + numRetiros));
        System.out.println();
    }
}
