import java.util.Scanner;

//    Escreva um programa que calcule a soma dos dígitos de um número inteiro positivo dado N.
//
//    Exemplo:
//    Número de Entrada: 123
//    Cálculo da Soma dos Dígitos:
//    Dígito 1: 1
//    Dígito 2: 2
//    Dígito 3: 3
//    Soma: 1 + 2 + 3 = 6
public class SomaDeDigitos05 {

    public static void main(String[] args) {
        Scanner lersoma = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int n = lersoma.nextInt();


        //Calculando e exibindo a soma dos digitos

        int soma = calcularSomaDosDigitos(n);
        System.out.println("Soma dos digitos: " + soma);

        lersoma.close();
    }

    //Funcao para calcular a soma dos digitos de um numero

    private static int calcularSomaDosDigitos(int numero) {
        int soma = 0;

        // Loop para percorrer cada dígito do número
        while (numero > 0) {
            int digito = numero % 10;  // Obtém o último dígito
            soma += digito;            // Adiciona o dígito à soma
            numero /= 10;              // Remove o último dígito do número
        }

        return soma;
    }

}
