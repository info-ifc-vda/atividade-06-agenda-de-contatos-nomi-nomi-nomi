public class Principal {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato ana = new Contato("Ana");
        ana.adicionarEmail("ana123@gmail.com");
        ana.adicionarEmail("ana@empresa.com");
        ana.adicionarTelefone("41 99999-8888");

        agenda.adicionarContato(ana);

        Contato bob = new Contato("Bob");
        bob.adicionarTelefone("41 98888-7777");
        agenda.adicionarContato(bob);

        System.out.println("LISTANDO CONTATOS:");
        agenda.listarContatos();

        System.out.println("BUSCANDO ANA:");
        System.out.println(agenda.buscarContato("Ana"));

        System.out.println("REMOVENDO BOB...");
        agenda.removerContato("Bob");

        System.out.println("LISTA APÓS REMOVER:");
        agenda.listarContatos();
    }
}