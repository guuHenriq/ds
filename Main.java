import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Informe o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Informe o preço de venda do produto:");
        double precoVenda = scanner.nextDouble();

        Produto produto = new Produto(nomeProduto, precoCusto, precoVenda);

        System.out.println("\nDetalhes do Produto:");
        System.out.println("Nome: " + produto.getName());
        System.out.println("Preço de custo: R$ " + produto.getPrecoCusto());
        System.out.println("Preço de venda: R$ " + produto.getPrecoVenda());
        System.out.println("Margem de lucro: R$ " + produto.getMargemLucro());
        System.out.println("Margem de lucro (%): " + produto.getMargemLucroPorcentagem() + "%");

        System.out.println("\nInforme o novo preço de venda do produto:");
        double novoPrecoVenda = scanner.nextDouble();
        produto.setPrecoVenda(novoPrecoVenda);

        System.out.println("\nDetalhes do Produto Atualizados:");
        System.out.println("Nome: " + produto.getName());
        System.out.println("Preço de custo: R$ " + produto.getPrecoCusto());
        System.out.println("Preço de venda: R$ " + produto.getPrecoVenda());
        System.out.println("Margem de lucro: R$ " + produto.getMargemLucro());
        System.out.println("Margem de lucro (%): " + produto.getMargemLucroPorcentagem() + "%");

        scanner.close();
    }
}
