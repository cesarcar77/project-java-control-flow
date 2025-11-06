import java.util.Scanner;

public class WeatherAdvisor { // Cambié el nombre de la clase a FizzBuzzBoom para reflejar el desafío

    public static void main(String[] args) {
        // 1. Inicializar Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario el rango
        System.out.println("--- Desafío FizzBuzzBoom ---");
        System.out.print("Ingresa el número de inicio del rango (ej: 1): ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final del rango (ej: 200): ");
        int fin = scanner.nextInt();

        // Cerrar el objeto Scanner
        scanner.close();

        System.out.println("\nIniciando FizzBuzzBoom desde " + inicio + " hasta " + fin + "...\n");

        // 3. Bucle con el rango personalizado
        for (int i = inicio; i <= fin; i++) {
            String resultado = "";

            // Múltiplo de 3
            if (i % 3 == 0) {
                resultado += "Fizz";
            }

            // Múltiplo de 5
            if (i % 5 == 0) {
                resultado += "Buzz";
            }

            // Múltiplo de 7 (¡el nuevo término!)
            if (i % 7 == 0) {
                resultado += "Boom";
            }

            // Imprimir el resultado o el número
            if (resultado.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(resultado);
            }
        }
    }
}