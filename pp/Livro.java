package pp;

public class Livro extends Publicacao {
    private String editora;
    private int numPaginas;
    
    public Livro(String titulo, String autor, String editora,int numPaginas, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.editora = editora;
        this.numPaginas = numPaginas;
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Editora: " + editora);
        System.out.println("Numero de paginas: " + numPaginas);
    }

    public void exibirDetalhes(boolean incluirEditora) {
        super.exibirDetalhes();
        if (incluirEditora) {
            System.out.println("Editora: " + editora);
        }
    }
    
}

  