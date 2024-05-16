import java.util.Scanner;

// 01 - Implemente um programa em java que solicite ao usuário a entrada de dois números de ponto flutuante e mostre a soma deles.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos dois numeros é: " + soma);
      
        scanner.close();
    }
}