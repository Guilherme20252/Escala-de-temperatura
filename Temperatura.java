import java.util.Scanner;

public class escalasTemp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escala atual (C, F ou K): ");
        String escala = scanner.next().toUpperCase();

        System.out.print("Digite a temperatura: ");
        double valor = scanner.nextDouble();

        if (escala.equals("C")) {
            double F = (valor * 9 / 5) + 32;
            double K = valor + 273.15;

            System.out.println("Fahrenheit: " + F);
            System.out.println("Kelvin: " + K);
        }

        else if (escala.equals("F")) {
            double C = (valor - 32) * 5 / 9;
            double K = C + 273.15;

            System.out.println("Celsius: " + C);
            System.out.println("Kelvin: " + K);
        }

        else if (escala.equals("K")) {
            double C = valor - 273.15;
            double F = (C * 9 / 5) + 32;

            System.out.println("Celsius: " + C);
            System.out.println("Fahrenheit: " + F);
        }

        else {
            System.out.println("Escala inválida.");
        }

        scanner.close();
    }
}
