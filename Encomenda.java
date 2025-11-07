public class Encomenda {

    private String endereco;
    private String destinatario;
    private String status;
    private int codigo;

    public Encomenda(String endereco, String destinatario, String status, int codigo) {
        this.endereco = endereco;
        this.destinatario = destinatario;
        this.status = status;
        this.codigo = codigo;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void exibirInfo() {
        System.out.println("\nDestinatario: " + destinatario + "\nEndereço: " + endereco + "\nCodigo: " + codigo
                + "\nStatus: " + status);
    }

    public int getCodigo() {
        return codigo;
    }
}