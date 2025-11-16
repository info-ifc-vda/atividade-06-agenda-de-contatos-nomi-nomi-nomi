import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private List<Email> emails;
    private List<Telefone> telefones;

    public Contato(String nome) {
        this.nome = nome;
        this.emails = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

    public void adicionarEmail(String endereco) {
        emails.add(new Email(endereco));
    }

    public void adicionarTelefone(String numero) {
        telefones.add(new Telefone(numero));
    }

    public String getNome() {
        return nome;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    @Override
    public String toString() {
        return "\nContato: " + nome +
               "\nEmails: " + emails +
               "\nTelefones: " + telefones + "\n";
    }
}