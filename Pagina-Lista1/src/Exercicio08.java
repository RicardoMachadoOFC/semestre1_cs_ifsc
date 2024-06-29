import java.util.Scanner;

public class Exercicio08 { // Escreva um algoritmo que calcule a raiz quadrada de um número informado pelo
                           // usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
        } else {
            double raizQuadrada = calcularRaizQuadrada(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
        }

        scanner.close();
    }

    public static double calcularRaizQuadrada(double numero) {
        double epsilon = 1e-10; // Precisão desejada
        double raiz = numero;

        while (Math.abs(raiz - numero / raiz) > epsilon * raiz) {
            raiz = (raiz + numero / raiz) / 2.0;
        }

        return raiz;
    }
}
