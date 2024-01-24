import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//    Escreva um programa que determine se uma palavra ou frase dada é um palíndromo. Um palíndromo é uma palavra, frase ou outra sequência de caracteres que se lê da mesma forma para frente e para trás, ignorando espaços, pontuação e maiúsculas/minúsculas.
//
//            Exemplo:
//    Vamos pegar a palavra "radar". Se a lermos da esquerda para a direita ou da direita para a esquerda, a palavra permanece "radar". Isso atende à definição de um palíndromo.
public class ExercicioPolindromo06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite uma palavra para verificarmos: ");
        String entrada = scanner.nextLine();


        // Remover espaços, pontuação e converter para minúsculas
        String textoLimpo = limparTexto(entrada);

        // Verificar se o texto limpo é um palíndromo
        if (ehPalindromo(textoLimpo)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }

    // Função para remover espaços, pontuação e converter para minúsculas
    private static String limparTexto(String texto) {
        return texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    // Função para verificar se uma string é um palíndromo
    private static boolean ehPalindromo(String texto) {
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;  // Se os caracteres não coincidem, não é um palíndromo
            }
            inicio++;
            fim--;
        }

        return true;  // Se o loop terminar, a string é um palíndromo
    }
}



