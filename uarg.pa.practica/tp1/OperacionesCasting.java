public class OperacionesCasting{

public static void main (String[] args) {
        int valor1 = 5, valor2 = 3, resultadoEntero;
        double decimal1 = 2.5, decimal2 =2.0, resultadoDecimal;
        
        resultadoEntero = valor1 / valor2;
        resultadoDecimal = valor1 / decimal1;
        resultadoDecimal = valor1 * valor2;
        resultadoEntero = (int) (decimal1 * decimal2);

}
}