import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPais {
    public static void main(String[] args) {
        List<Pais> listaPaises = new ArrayList<>();
        listaPaises.add(new Pais("Brasil"));
        listaPaises.add(new Pais("Brasil"));
        listaPaises.add(new Pais("Argentina"));
        listaPaises.add(new Pais("Chile"));
        listaPaises.add(new Pais("Uruguai"));
        listaPaises.add(new Pais("Portugal"));
        listaPaises.add(new Pais("Bolívia"));
        listaPaises.add(new Pais("China"));
        listaPaises.add(new Pais("Estados Unidos"));
        listaPaises.add(new Pais("França"));
        listaPaises.add(new Pais("Japão"));
        listaPaises.add(new Pais("Coréia"));

        Collections.sort(listaPaises, (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));

        System.out.println("Lista de países ordenada:");
        for (Pais pais : listaPaises) {
            System.out.println(pais.getNome());
        }
    }
}