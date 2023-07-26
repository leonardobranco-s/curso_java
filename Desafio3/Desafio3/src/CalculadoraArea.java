import java.util.Scanner;

public class CalculadoraArea {
    public static void calculaCirculo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o raio do seu circulo:");
        double raio = s.nextDouble();
        double pi = 3.14;
        double areaCirculo = (pi * (Math.pow(raio,2)));
        System.out.println("A área do seu circulo é: " +areaCirculo+ "cm");
    }

    public static void caclulaQuadrado() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o lado do seu quadrado:");
        double lado = s.nextDouble();
        double areaQuadrado = (Math.pow(lado,2));
        System.out.println("A área do seu quadrado é: " +areaQuadrado+ "cm");

    }

    public static void caclulaRetangulo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a base do seu retangulo:");
        double base = s.nextDouble();
        System.out.println("Digite a altura do seu retangulo:");
        double altura = s.nextDouble();
        double areaRetangulo = (base * altura);
        System.out.println("A área do seu retangulo é: " +areaRetangulo+ "cm");

    }
}