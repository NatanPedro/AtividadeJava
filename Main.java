import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n;
    int n2;
    System.out.println("Digite um numero: ");
    n = input.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = input.nextInt();

        int soma = n * n2;

        System.out.println("O resultado da multiplicação é: "+soma);

    }
}