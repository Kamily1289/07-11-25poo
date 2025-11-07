public class Encomenda {
    // ATRIBUTOS

    private int codigo;
    private String destinatario;
    private String endereco;
    private String status;

    // CONSTRUTOR
    public Encomenda(int codigo, String destinatario, String endereco, String status) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = status;
    }

    // MÉTODOS
    public void exibirInf() {
        System.out.println("codigo: " + codigo + "/n destinatario:" + destinatario + "/n endereco:" + endereco
                + "/n status:" + status);

    }

    // estrutura do set
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public int getCodigo() {
        return codigo;
    }

}
