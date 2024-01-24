//Elabore um programa que determine se um número é primo ou não.
//Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.

import java.util.Scanner;

public class ExercicioPrimo01 {




public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero inteiro positivo:");
    int numero = scanner.nextInt();

    if (ehPrimo(numero)) {
        System.out.println(numero + " é um número primo.");
    } else {
        System.out.println(numero + " não é um número primo.");
    }

    scanner.close();

}

// Função para verificar se um número é primo
private static boolean ehPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }

    return true;
}
}
