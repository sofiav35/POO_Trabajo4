package CarreraCiclistica;

import java.util.Scanner;
import java.util.Vector;

public class Equipo {
    private String nombre;
    private double totalTiempo; 
    private String pais;
    private Vector<Ciclista> listaCiclistas = new Vector<>();

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo= 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }    
    
    void listarEquipo() {
        for (Ciclista c : listaCiclistas) {
            System.out.println(c.getNombre());
        }
    }
    
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del ciclista: ");
        String nombreCiclista = sc.nextLine();
        for (Ciclista c : listaCiclistas) {
            if (c.getNombre().equalsIgnoreCase(nombreCiclista)) { 
                System.out.println(c.getNombre());
                return;
            }
        }
        System.out.println("Ciclista no encontrado.");
    }
    
    void calcularTotalTiempo() {
        totalTiempo = 0; 
        for (Ciclista c : listaCiclistas) { 
            totalTiempo += c.getTiempoAcumulado();
        }
    }
    
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo =" + totalTiempo);
    }   
}


