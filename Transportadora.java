public class Transportadora {
    // ATRIBUTOS
    private Encomenda[] encomendas = new Encomenda[10];
    private int quantidade = 0;

    // MÉTODOS
    public void adicionarEncomenda(Encomenda encomenda) {
        this.encomendas[quantidade] = encomenda;
        this.quantidade++;
    }

    public void listarEncomeda() {
        for (Encomenda encomenda : encomendas) {
            encomenda.exibirInf();
        }
    }

    public Encomenda buscarPorCodigo(int codigo) {
        Encomenda fev = null;
        for (Encomenda fiv : encomendas) {
            if (fiv.getCodigo() == codigo) {
                fev = fiv;
            }
        }
        return fev;
    }

}
