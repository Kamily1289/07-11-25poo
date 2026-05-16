public class Main {

    public static void main(String[] args) {

        // Criando o carrinho
        CarrinhoCompras carrinho = new CarrinhoCompras();

        // Adicionando itens
        carrinho.adicionarItemNoCarrinho("Notebook");
        carrinho.adicionarItemNoCarrinho("Mouse");
        carrinho.adicionarItemNoCarrinho("Teclado");

        // Mostrando itens
        carrinho.mostrarItensDoCarrinho();

        // Mostrando quantidade
        carrinho.mostrarQuantidadeItens();

        // Removendo item
        carrinho.removerItemDoCarrinho("Mouse");

        // Mostrando itens novamente
        carrinho.mostrarItensDoCarrinho();

        // Mostrando quantidade novamente
        carrinho.mostrarQuantidadeItens();
    }
}
