package Animales;

public class Perro extends Canido{
    
    @Override
    public String getSonido(){
        return "Ladrido";
    }
    
    @Override
    public String getAlimentos(){
        return"Carnivora";
    }
    
    @Override
    public String getHabitad(){
        return "Doméstico";
    }
 
    @Override
    public String getNombreCientifico(){
        return"Canis lupus familiaris";
    }
    
}
