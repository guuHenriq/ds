package mvie;

public class TestarFilme {
	
	public class Filme {
		
	    private String titulo;
	    private int duracaoEmMinutos;
	 
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	 
	    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
	        this.duracaoEmMinutos = duracaoEmMinutos;
	    }
	 
	    public void exibirDuracaoEmHoras() {
	        int horas = duracaoEmMinutos / 60;
	        int minutos = duracaoEmMinutos % 60;
	        System.out.println(titulo + " possui " + horas + " horas e " + minutos + " minutos.");
	    }
	 
	    public String getTitulo() {
	        return titulo;
	    }
	}
}
