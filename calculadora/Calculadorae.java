
	import java.util.List;

	public class Calculadorae {
	    private String nome;
	    private double resultado;

	    public Calculadorae(String nome) {
	        this.nome = nome;
	        this.resultado = 0.0; // Inicializa o resultado como zero
	    }

	    // Método para soma de dois inteiros
	    public int soma(int a, int b) {
	        this.resultado = a + b;
	        return (int) this.resultado;
	    }

	    // Método para soma de dois decimais
	    public double soma(double a, double b) {
	        this.resultado = a + b;
	        return this.resultado;
	    }

	    // Método para soma de uma lista de números
	    public double soma(List<Double> numeros) {
	        this.resultado = 0.0;
	        for (double num : numeros) {
	            this.resultado += num;
	        }
	        return this.resultado;
	    }

	    // Método para subtração de dois inteiros
	    public int subtracao(int a, int b) {
	        this.resultado = a - b;
	        return (int) this.resultado;
	    }

	    // Método para subtração de dois decimais
	    public double subtracao(double a, double b) {
	        this.resultado = a - b;
	        return this.resultado;
	    }

	    // Método para subtração de uma lista de números
	    public double subtracao(List<Double> numeros) {
	        if (numeros.isEmpty()) {
	            return 0.0; // Retorna zero se a lista estiver vazia
	        }

	        this.resultado = numeros.get(0); // Inicializa com o primeiro número
	        for (int i = 1; i < numeros.size(); i++) {
	            this.resultado -= numeros.get(i); // Subtrai os números subsequentes
	        }
	        return this.resultado;
	    }
}
