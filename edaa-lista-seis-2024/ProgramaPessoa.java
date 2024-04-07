import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Daniel", 31));
        pessoas.add(new Pessoa("Lucas", 18));

        Collections.sort(pessoas, (p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));

        System.out.println("Lista de pessoas ordenada por idade:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade() + " anos");
        }
    }
}