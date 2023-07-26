import java.util.Scanner;

public class CalculadoraImc {
    public static void calculaImc() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a sua altura:");
        double altura = s.nextDouble();
        System.out.println("Digite o seu peso:");
        double peso = s.nextDouble();
        double imc = (peso/(Math.pow(altura,2)));
        System.out.println("O seu IMC é: "+imc);
    }

}