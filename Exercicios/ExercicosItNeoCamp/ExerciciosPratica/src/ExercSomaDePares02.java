//Exercício 1: Soma de Números Pares
//Calcular a soma de todos os números pares até um número dado N.
//        Exemplo: se N=10, então a soma dos pares será 2+4+6+8+10=30


import java.util.Scanner;

public class ExercSomaDePares02 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o numero que seja inteiro positivo N: ");
        int n = leitura.nextInt();

        if (n < 0) {
            System.out.println("Digite o numero inteiro positivo. ");
        }else{
            int somaPares = calcularSomaNumerosPares(n);
            System.out.println("A soma dos numeros pares ate " + n +  "é: " + somaPares);
        }

        leitura.close();
    }

    private static int calcularSomaNumerosPares(int n){
        int soma = 0;
        for (int i = 2; i <=n; i +=2){

            soma += i;
        }
        return soma;
    }
}
