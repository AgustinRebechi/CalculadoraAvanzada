public class PruebaCalculadoraAvanzada {
    public static void main(String[] args) {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

        System.out.println("sumar int: " + calculadora.sumar(1,3) + " sumar double: " + calculadora.sumar(1.0,3.0));
        System.out.println("restar int: " + calculadora.restar(1,3) + " restar double: " + calculadora.restar(1.0,3.0));
        System.out.println("multiplicar int: " + calculadora.multiplicar(1,3) + " multiplicar double: " + calculadora.multiplicar(1.0,3.0));
        System.out.println("dividir int: " + calculadora.dividir(1,3) + " dividir double: " + calculadora.dividir(1.0,3.0));


    }
}
