import java.util.Scanner;

public class CalculadoraCompleta {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char escolha;

            do {
                System.out.println("======= CALCULADORA ========");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Divisão Modular");
                System.out.println("6 - Seno");
                System.out.println("7 - Cosseno");
                System.out.println("8 - Tangente");
                System.out.println("9 - Exponenciação");
                System.out.println("10 - Raiz Quadrada");
                System.out.println("0 - Sair");
                System.out.println("==============================");

                System.out.println("Escolha uma operação com valores de (0-10): ");
                int escolhaOperacao = scanner.nextInt();

                if (escolhaOperacao == 0) {
                    System.out.println("Saindo da calculadora. Até mais!");
                    break;
                }

                realizarOperacao(escolhaOperacao, scanner);

                System.out.println("Deseja realizar outra operação? (S/N): ");
                escolha = scanner.next().charAt(0);   //Esta linha lê a entrada do usuário após a mensagem anterior.
                // O método next() lê a próxima sequência de caracteres (até o próximo espaço em branco) e charAt(0)
                // obtém o primeiro caractere dessa sequência.

            } while (escolha == 'S' || escolha == 's'); //Este é o teste de condição do loop do-while.
            // O loop continuará enquanto a escolha do usuário for 'S' (maiúsculo) ou 's' (minúsculo).
            // Se o usuário escolher 'N' ou qualquer outra entrada, o loop será encerrado.
        }

        private static void realizarOperacao(int escolhaOperacao, Scanner scanner) {
            double num1, num2, resultado;

            switch (escolhaOperacao) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;

                case 5:
                    System.out.println("Digite o primeiro valor: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 % num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 6:
                    System.out.println("Digite o valor do ângulo em graus: ");
                    num1 = scanner.nextDouble();
                    resultado = Math.sin(Math.toRadians(num1));
                    System.out.println("Resultado: " + resultado);
                    break;

                case 7:
                    System.out.println("Digite o valor do ângulo em graus: ");
                    num1 = scanner.nextDouble();
                    resultado = Math.cos(Math.toRadians(num1));
                    System.out.println("Resultado: " + resultado);
                    break;

                case 8:
                    System.out.println("Digite o valor do ângulo em graus: ");
                    num1 = scanner.nextDouble();
                    resultado = Math.tan(Math.toRadians(num1));
                    System.out.println("Resultado: " + resultado);
                    break;

                case 9:
                    System.out.println("Digite a base: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o expoente: ");
                    num2 = scanner.nextDouble();
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 10:
                    System.out.println("Digite o valor para calcular a raiz quadrada: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }


