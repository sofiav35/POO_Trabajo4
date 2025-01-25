package CuentasBancarias;

public class CuentaBancaria {
    //Atributos
    float saldo;    
    int numConsignaciones=0;
    int numRetiros=0;
    float tasaAnual;
    float comision;
    
    //Constructor
    public CuentaBancaria(float saldo, float tasa){
        this.saldo=saldo;
        this.tasaAnual=tasa;
        
    }
    
    //Métodos 
    public void Consignar(float valor){
     saldo+= valor;
     numConsignaciones += 1;
    }
    public void Retirar(float valor){
            if (valor<=saldo){
                saldo -= valor;
                numRetiros+=1;
            }
            else{
                System.out.println("No tienes saldo suficiente"); 
            }
    }
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12; 
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    public void extractoMensual() {
        saldo -= comision;
        calcularInteres();
    }
  }
