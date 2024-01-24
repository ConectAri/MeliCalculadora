import java.util.Scanner;

public class CalculadoraMain2 {

    //Tipo de acesso
    //Tipo de retorno
    //Nome do metodo
    //Variaveis de atributo

    //Fazer: Adicao, subtracao, multiplicacao, divisao, divisao modular , seno e cosseno, exponenciacao x elevadoi e math.pow, raiz quadrada
    //Para facilitar a chamada, imporante fazer static

    public static int soma(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtracao(int n1, int n2) {
        return n1 - n2;
    }


    public static double div(int n1, int n2) {
        return n1 / n2;
    }

    public static int mult(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int number1 = imprimir.nextInt();

        System.out.println("Informe o segundo numero: ");
        int number2 = imprimir.nextInt();

        System.out.println("Informe o operador que voc deseja: ");
        char op = imprimir.next().charAt(0); // O char é usado para incluir letras, caracteres, numeros

        switch (op) {

            case '+':
                System.out.println("A soma é:" + soma(number1, number2));
                break;

            case '-':
                System.out.println("A subtracao  é:" + subtracao(number1, number2));
                break;

            case '/':
                System.out.println("A divisao é:" + div(number1, number2));
                break;

            case '*':
                System.out.println("A multiplicacao  é:" + div(number1, number2));
                break;

            default:
                System.out.println(" Operacao inválida!!!!");

        }

        System.out.println();

        System.out.println(" Informe o número da raiz que deseja saber: ");
        double numero = imprimir.nextDouble();

        System.out.println(" A raiz quadrada é: "  + Math.sqrt(numero));

        System.out.println();
        System.out.println();

//        /Criando operacoes com Seno, cosseno e tangente/

        System.out.println(" Informe o angulo: ");
        double raio = imprimir.nextDouble();

        double a = Math.toRadians(raio);

        System.out.println(" O seno de " + raio + "graus é: " + Math.sin(a));
        System.out.println(" O Cosseno de " + raio + "graus é: " + Math.cos(a));
        System.out.println(" A Tangente de " + raio + "graus é: " + Math.tan(a));


        }

    }





