//Gerar os primeiros N termos da sequência Fibonacci.
//A sequência de Fibonacci é uma sequência matemática que começa com 0 e 1, e cada termo subsequente é a soma dos dois termos anteriores. Em termos matemáticos, a sequência de Fibonacci é definida da seguinte forma:
//F(n) = F(n-1) + F(n-2)
//Onde F(0) = 0 e F(1) = 1. A sequência resultante é: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 e assim por diante.
//

import java.util.Scanner;

public class ExercFribonacci04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos da sequencia Fibonacci que deseja gerar: ");
        int n = scanner.nextInt();

        System.out.println("Os primeiros " + n + " termos da sequência Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    //Funcao para calcular o termo da sequencia Fibonacci

    private static int calcularFibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
            // Caso geral: retorna a soma dos dois termos anteriores
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}


