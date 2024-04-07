import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaAnimal {
    public static void main(String[] args) {
        List<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(new Animal("Jacaré"));
        listaAnimais.add(new Animal("Leão"));
        listaAnimais.add(new Animal("Girafa"));
        listaAnimais.add(new Animal("Elefante"));
        listaAnimais.add(new Animal("Zebra"));
        listaAnimais.add(new Animal("Cachorro"));
        listaAnimais.add(new Animal("Gato"));
        listaAnimais.add(new Animal("Cobra"));
        listaAnimais.add(new Animal("Morcego"));

        Collections.sort(listaAnimais, (a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()));

        System.out.println("Lista de animais ordenada:");
        for (Animal animal : listaAnimais) {
            System.out.println(animal.getNome());
        }
    }
}