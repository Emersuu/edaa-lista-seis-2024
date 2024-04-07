import java.util.ArrayList;
import java.util.List;

class ListaCompras {
    private List<String> itens;

    public ListaCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void removerItem(String item) {
        itens.remove(item);
    }

    public void exibirLista() {
        if (itens.isEmpty()) {
            System.out.println("Lista de compras vazia.");
        } else {
            System.out.println("Lista de compras:");
            for (String item : itens) {
                System.out.println("- " + item);
            }
        }
    }
}