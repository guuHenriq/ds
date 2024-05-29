import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");
        System.out.print("Digite o nome da calculadora: ");
        String nomeCalculadora = scanner.nextLine();

        // Criando uma instância da Calculadora
        Calculadorae minhaCalculadora = new Calculadorae(nomeCalculadora);

        // Menu de operações
        while (true) {
            System.out.println("\nEscolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo da calculadora. Até mais!");
                break;
            }

            double resultado = 0.0;

            switch (opcao) {
                case 1:
                    // Operação de soma
                    System.out.println("Operação de Soma");
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = minhaCalculadora.soma(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    // Operação de subtração
                    System.out.println("Operação de Subtração");
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = minhaCalculadora.subtracao(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close(); // Fechando o scanner após o uso
    }

	}


