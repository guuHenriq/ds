package pp;

public class Revista extends Publicacao {
	    private String mesPubli;
	    private int numEdicao;
	    

	    public Revista(String titulo, String autor, String mesPubli,int numEdicao, int anoPublicacao) {
	        super(titulo, autor, anoPublicacao);
	        this.mesPubli = mesPubli;
	        this.numEdicao = numEdicao;
	    }
	   
	    public String getMesPubli() {
	        return mesPubli;
	    }

	    public void setMesPubli(String mesPubli) {
	        this.mesPubli = mesPubli;
	    }

	    @Override
	    public void exibirDetalhes() {
	        super.exibirDetalhes();
	        System.out.println("Mes de publicacao : " + mesPubli);
	        System.out.println("O numero da edição é : " + numEdicao);
	    }

	    public void exibirDetalhes(boolean incluirMesPubli) {
	        super.exibirDetalhes();
	        if (incluirMesPubli) {
	            System.out.println("O mes da publicação é : " + mesPubli);
	        }
	    }
	    
	}

	  


