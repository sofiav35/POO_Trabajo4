package Animales;

public class PruebaP3 {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (Animal animal : animales) {
            
            System.out.println(animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitad: " + animal.getHabitad());
            System.out.println();
        }
    }   
}
