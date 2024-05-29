package mvie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Filme filme1 = new Filme();
        filme1.setTitulo("Os Vingadores");
        filme1.setDuracaoEmMinutos(142);
        filme1.exibirDuracaoEmHoras();

        Filme filme2 = new Filme(); 
        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);
        filme2.exibirDuracaoEmHoras();
 
        System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());
 
        Filme filme3 = new Filme();
        filme3.setTitulo("Interestelar");
        filme3.setDuracaoEmMinutos(169);
        filme3.exibirDuracaoEmHoras();
 
        Filme filme4 = new Filme();
        filme4.setTitulo("Toy Story");
        filme4.setDuracaoEmMinutos(81);
        filme4.exibirDuracaoEmHoras();
 
        Filme filme5 = new Filme();
        filme5.setTitulo("Pantera Negra");
        filme5.setDuracaoEmMinutos(134);
        filme5.exibirDuracaoEmHoras();
 
        System.out.println("Os filmes em cartaz são " + filme3.getTitulo() + ", " + filme4.getTitulo() + " e " + filme5.getTitulo());
    }

	}


