import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner s = new Scanner(System.in);

            System.out.print(" Shadow Temperaturas \n\n");
            System.out.print("|----------------------------|\n");
            System.out.print("| 1- Converter para Fahrenheit: |\n");
            System.out.print("| 2- Converter para Kelvin: |\n");
            System.out.print("| 3- Converter para Reaumur: |\n");
            System.out.print("| 4- Converter para Rankine: |\n");
            System.out.print("| 5- Sair do programa |\n");
            System.out.print("|----------------------------|\n");
            System.out.print("Digite uma opção: ");
            int resposta = s.nextInt();
            double temperatura = 0;

            if(resposta != 5) {
                System.out.println("Insira a temperatura em Celsius: ");
                temperatura = s.nextDouble();
            }

            switch (resposta) {
                case 1:
                    double tempFahr = (temperatura * 1.8) + 32;
                    System.out.println("Sua temperatura em Fahrenheit é: " + tempFahr);
                    break;
                case 2:
                    double tempKelvin = (temperatura + 273.15);
                    System.out.println("Sua temperatura em Kelvin é:" + tempKelvin);
                    break;
                case 3:
                    double tempReaumur = (temperatura * 0.8);
                    System.out.println("Sua temperatura em Reaumur é:" + tempReaumur);
                    break;
                case 4:
                    double tempRankine = (temperatura * 1.8) + 32 + 459.67;
                    System.out.println("Sua temperatura em Rankine é:" + tempRankine);
                    break;
                case 5:
                    System.out.println("Até logo!");
                    s.close();
                    flag = false;
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        }
    }
}
