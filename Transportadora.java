public class Transportadora {

    private Encomenda[] encomendas = new Encomenda[10];
    private int quantidade = 0;

    public void adicionarEncomenda(Encomenda encomenda) {
        if (quantidade < 10) {
            encomendas[quantidade] = encomenda;
            quantidade++;
        } else {
            System.out.println("Turma cheia!");
        }
    }

    public void listarEncomendas() {
        for (Encomenda encomenda : encomendas) {
            encomenda.exibirInfo();
        }
    }

    public Encomenda buscarPorCodigo(int codigo) {
        Encomenda pessoa = null;
        for (Encomenda encomenda : encomendas) {
            if (encomenda.getCodigo() == codigo) {
                pessoa = encomenda;
            }
        }
        return (pessoa != null) ? pessoa : null;
    }

    public void atualizarStatus(String novoStatus) {
        for (Encomenda encomenda : encomendas) {
            encomenda.atualizarStatus(novoStatus);
        }
    }
}