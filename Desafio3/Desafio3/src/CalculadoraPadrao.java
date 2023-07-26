import java.util.Scanner;

public class CalculadoraPadrao {
    public static void soma() {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira um numero:");
        double num1 = s.nextDouble();
        System.out.print("Insira outro numero para somar ao primeiro numero:");
        double num2 = s.nextDouble();
        double soma = (num1 + num2);
        System.out.println("O resultado da soma é: " +soma);


    }
    public static void subtracao(){
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um numero :");
        double num1 = s.nextDouble();
        System.out.println("Insira outro numero para subtrair do primeiro numero:");
        double num2 = s.nextDouble();
        double subtracao = (num1 - num2);
        System.out.println("O resultado da subtração é: "+subtracao);

    }

    public static void divisao() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um numero:");
        double num1 = s.nextDouble();
        System.out.println("Insira outro numero para dividir o primeiro numero:");
        double num2 = s.nextDouble();
        double divisao = (num1 / num2);
        System.out.println("O resultado da divisão é: "+divisao);

    }

    public static void multiplicacao() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um numero:");
        double num1 = s.nextDouble();
        System.out.println("Insira outro numero para multiplicar o primeiro numero:");
        double num2 = s.nextDouble();
        double multiplicacao = (num1 * num2);
        System.out.println("O resultado da multiplicação é: "+multiplicacao);

    }

    public static void potenciacao() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um numero:");
        double num1 = s.nextDouble();
        System.out.println("Insira outro numero para elevar o primeiro numero:");
        double num2 = s.nextDouble();
        double potenciacao =  (Math.pow(num1, num2));
        System.out.println("O resultado da potenciação é: "+potenciacao);
    }
}