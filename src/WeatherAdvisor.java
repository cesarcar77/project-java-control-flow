public class WeatherAdvisor {

    public static void main(String[] args) {
        // El bucle 'for' se encarga de contar desde 1 hasta 100
        for (int i = 1; i <= 100; i++) {

            // Creamos una variable String para construir el resultado.
            // Esto es una forma elegante de manejar la lógica.
            String resultado = "";

            // 1. Verificar si es múltiplo de 3
            if (i % 3 == 0) {
                resultado = resultado + "Fizz";
            }

            // 2. Verificar si es múltiplo de 5
            if (i % 5 == 0) {
                resultado = resultado + "Buzz";
            }

            // 3. Imprimir el resultado.
            // Si el número fue múltiplo de 3 y/o 5, 'resultado' tendrá "Fizz", "Buzz" o "FizzBuzz".
            // Si no fue múltiplo de ninguno, 'resultado' estará vacío.
            if (resultado.isEmpty()) {
                // En los demás casos, imprimimos el número
                System.out.println(i);
            } else {
                // Imprimimos "Fizz", "Buzz" o "FizzBuzz"
                System.out.println(resultado);
            }
        }
    }
}