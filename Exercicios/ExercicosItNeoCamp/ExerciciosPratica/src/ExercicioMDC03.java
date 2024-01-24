//Escreva um programa que encontre o Máximo Comum Divisor (MDC) de dois números. O MDC é o maior número que divide exatamente ambos os números.
//        Por exemplo, consideremos os números 48 e 18:
//Os divisores de 48 são 1, 2, 3, 4, 6, 8, 12, 16, 24 e 48.
//Os divisores de 18 são 1, 2, 3, 6, 9 e 18.
//O MDC de 48 e 18 é 6, pois é o maior número presente em ambas as listas.


import java.util.Scanner;

public class ExercicioMDC03 {

    public static void main(String[] args) {
        Scanner lermdc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numero1 = lermdc.nextInt();

        System.out.println("Informe o segundo numero: ");
        int numero2 = lermdc.nextInt();

        int mdc = calcularMDC(numero1, numero2);

        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é : " + mdc);
        lermdc.close();
    }

    // Função para calcular o MDC usando o algoritmo de Euclides
    //No metodo estatico posso chamar eles usando direto o nome da classe sem precisar criar um objeto

    private static int calcularMDC(int a, int b) {
        while (b != 0) {  // while estrutura de repeticao  diferente de zero // o MDC de dois números é o último resto não nulo obtido pelo algoritmo de Euclides.
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
