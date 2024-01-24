import java.util.Scanner;
import java.util.SortedMap;

public class CalculadoraBasico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= CALCULADORA ========");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        System.out.println("Por favor, escolha uma opção: ");
        int op = sc.nextInt();

        realizarOperacao(op, sc);
    }


    private static void realizarOperacao(int op, Scanner sc) {
        int num1, num2;
        switch (op) {
            case 1:
                System.out.println("Digite o primeiro valor:");
                num1 = sc.nextInt();

                System.out.println("Digite o segundo valor: ");
                num2 = sc.nextInt();

                int soma = num1 + num2;
                System.out.printf("A soma entre %d + %d = %d.%n", num1, num2, soma);
                break;

            // Adicione mais casos para outras operações aqui

            default:
                System.out.println(op + " não é uma opção válida!");
        }

    }


}

