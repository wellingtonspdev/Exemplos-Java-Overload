public class ExemploOverload {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultadoInt = calc.somar(5, 3);
        System.out.println("Resultado (int): " + resultadoInt);

        double resultadoDouble = calc.somar(2.5, 3.7);
        System.out.println("Resultado (double): " + resultadoDouble);
    }
}