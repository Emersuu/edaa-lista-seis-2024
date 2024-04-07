public class ProgramaContato {
    public static void main(String[] args) {
        ListaDeContatos listaDeContatos = new ListaDeContatos();

        listaDeContatos.adicionarContato("João", "111111111");
        listaDeContatos.adicionarContato("Maria", "222222222");
        listaDeContatos.adicionarContato("Carlos", "333333333");

        listaDeContatos.listarContatos();

        Contato contato = listaDeContatos.buscarContato("Maria");
        if (contato != null) {
            System.out.println("Contato encontrado - Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}