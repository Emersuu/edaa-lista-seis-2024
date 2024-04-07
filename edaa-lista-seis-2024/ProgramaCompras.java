public class ProgramaCompras {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();

        lista.adicionarItem("Arroz");
        lista.adicionarItem("Feijão");
        lista.adicionarItem("Carne");
        lista.adicionarItem("Pão");

        lista.exibirLista();

        lista.removerItem("Carne");

        lista.exibirLista();
    }
}