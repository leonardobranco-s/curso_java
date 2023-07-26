import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Shadow Calculadoras \n\n");
        System.out.println("| ----------------------------|\n");
        System.out.println("| 1 - Calculadora padrão|\n");
        System.out.println("| 2 - Calculadora IMC|\n");
        System.out.println("| 3 - Calculadora area|\n");
        System.out.println("| 4 - Sair do programa|\n");
        System.out.println("| ----------------------------|\n");
        System.out.println("| Digite uma opção:|\n");
        int opcao = s.nextInt();


        if (opcao == 1) {
            System.out.println("| 1 - Soma |\n");
            System.out.println("| 2 - Subtração |\n");
            System.out.println("| 3 - Divisão |\n");
            System.out.println("| 4 - Multiplicação |\n");
            System.out.println("| 5 - Potenciação |\n");
            System.out.println("| Digite uma opção: |\n");
            int opcao1 = s.nextInt();
            if (opcao1 == 1){
                CalculadoraPadrao.soma();
            } else if (opcao1 == 2){
                CalculadoraPadrao.subtracao();
            } else if (opcao1 == 3){
                CalculadoraPadrao.divisao();
            } else if (opcao1 == 4){
                CalculadoraPadrao.multiplicacao();
            } else if (opcao1 == 5){
                CalculadoraPadrao.potenciacao();
            } else {
                System.out.println("Resposta inválida!");
            }

        } else if (opcao == 2) {
            CalculadoraImc.calculaImc();
        } else if (opcao == 3) {
            System.out.println("| 1 - Circulo |\n");
            System.out.println("| 2 - Quadrado |\n");
            System.out.println("| 3 - Retangulo |\n");
            System.out.println("| Digite uma opção: |\n");
            int opcao3 = s.nextInt();
            if (opcao3 == 1){
                CalculadoraArea.calculaCirculo();
            } else if (opcao3 == 2){
                CalculadoraArea.caclulaQuadrado();
            } else if (opcao3 == 3) {
                CalculadoraArea.caclulaRetangulo();
            } else {
                System.out.println("Resposta inválida!");
            }
        } else if (opcao == 4) {
            System.out.println("Até logo!");
        } else {
            System.out.println("Resposta inválida!");
        }


    }
}




