// importação da biblioteca para adicionar,remover,armazenar e acrecentar
import java.util.ArrayList;

//Criação da classe = define atributos e metódos
public class CarrinhoCompras {

    //Atributos ocorrendo o encapsulamento e armazenando texto 
    private ArrayList<String> itens;

    //Construtor 
    public CarrinhoCompras() {
        // Criação dda lista vazia
        itens = new ArrayList<>();
    }
    
    public void adicionarItemNoCarrinho(String item) {
        itens.add(item);
        System.out.println(item + " foi adicionado");
    }

    public void removerItemDoCarrinho(String item) {
        itens.remove(item);
        System.out.println(item + " foi removido");
    }

    public void mostrarItensDoCarrinho() {

        System.out.println("Itens no carrinho:");

        // FOR-EACH armazena os intens acrecentados
        for (String item : itens) {
            System.out.println("- " + item);
        }
    }

    public void mostrarQuantidadeItens() {
        System.out.println("Quantidade de itens: " + itens.size());
    }
}
