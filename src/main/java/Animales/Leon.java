package Animales;

public class Leon extends Felino{
    @Override
    public String getSonido(){
        return "Rugido";
    }
    
    @Override
    public String getAlimentos(){
        return"Carnivora";
    }
    
    @Override
    public String getHabitad(){
        return "Pradera";
    }
 
    @Override
    public String getNombreCientifico(){
        return"Panthera leo";
    }
}
