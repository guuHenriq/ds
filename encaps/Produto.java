class Produto {

    private String nome;
    private double precoCusto;
    private double precoVenda;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getName() {
        return nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getMargemLucro() {
        return precoVenda - precoCusto;
    }

    public double getMargemLucroPorcentagem() {
        return ((precoVenda - precoCusto) / precoCusto) * 100;
    }

    public void setPrecoVenda(double novoPrecoVenda) {
        if (novoPrecoVenda >= this.precoCusto) {
            this.precoVenda = novoPrecoVenda;
        } else {
            System.out.println("Erro: O preço de venda não pode ser inferior ao preço de custo.");
        }
    }
}