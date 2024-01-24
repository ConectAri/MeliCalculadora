public class CalculadoraChamada {

    CalculadoraMain2 calc = new CalculadoraMain2();

    // Void  o tipo de retorno
    public static void main(String[] args) {

        //Metodos estaticos so podem ser usados dentro de metodos estaticos

        System.out.println(" Segue a calculadora ");

        System.out.println(CalculadoraMain2.soma(1, 2)); //Static

        System.out.println(CalculadoraMain2.subtracao(1, 2));

        System.out.println(CalculadoraMain2.mult(1, 2));

        System.out.println(CalculadoraMain2.div(1,2));
    }
}
