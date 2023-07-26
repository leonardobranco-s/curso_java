import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Double> dbaList = new ArrayList<>();
        List<Double> devList = new ArrayList<>();
        List<Double> rhList = new ArrayList<>();
        System.out.print("| Insira o número total de funcionários: |\n");
        int funcionarios = s.nextInt();
        for (int i = funcionarios; i > 0; i -= 1) {
            System.out.println("Digite o cargo:");
            System.out.println("1 - DBA");
            System.out.println("2 - Dev");
            System.out.println("3 - RH");
            System.out.println("4 - Sair do programa");
            int cargo = s.nextInt();

            if (cargo == 1) {
                System.out.println("Digite o salário:");
                Double salario = s.nextDouble();
                dbaList.add(salario);
            } else if (cargo == 2) {
                System.out.println("Digite o salário:");
                Double salario = s.nextDouble();
                devList.add(salario);
            } else if (cargo == 3) {
                System.out.println("Digite o salário:");
                Double salario = s.nextDouble();
                rhList.add(salario);
            } else if (cargo == 4) {
                System.out.println("Até logo!");
                break;
            }
            else {
                System.out.println("Resposta inválida!");
                i+=1;
            }

            }

            if (dbaList.size() != 0) {
                double dbaMedia = (dbaList.stream().mapToDouble(Double::doubleValue).sum()) / dbaList.size();
                System.out.println("A média do salário do cargo 'DBA' é:" + dbaMedia);
            }
            if (devList.size() != 0) {
                double devMedia = (devList.stream().mapToDouble(Double::doubleValue).sum()) / devList.size();
                System.out.println("A média do salário do cargo 'Dev' é:" + devMedia);
            }
            if (rhList.size() != 0) {
                double rhMedia = (rhList.stream().mapToDouble(Double::doubleValue).sum()) / rhList.size();
                System.out.println("A média do salário do cargo 'RH' é:" + rhMedia);
            }

        }
    }














