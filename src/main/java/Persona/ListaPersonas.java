package Persona;

import java.util.Vector;

public class ListaPersonas {
    private Vector<Persona> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new Vector<>();
    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        if (i >= 0 && i < listaPersonas.size()) {
            listaPersonas.remove(i);
        }
    }

    public void borrarLista() {
        listaPersonas.clear();
    }
}
    

