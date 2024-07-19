import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

             double[] salariosBrutos = new double[5];
             double[] salariosLiquidos = new double[5];
             double[] descontosINSS = new double[5];
             double[] descontosIR = new double[5];

             System.out.println("Informe os salários brutos de 5 funcionários da empresa X:");
             for (int i = 0; i < 5; i++) {
                    System.out.printf("Funcionário %d: ", i + 1);
                    salariosBrutos[i] = scanner.nextDouble();
             }


             for (int i = 0; i < 5; i++) {
                    double salarioBruto = salariosBrutos[i];

                    double descontoINSS = calcularDescontoINSS(salarioBruto);
                    descontosINSS[i] = descontoINSS;

                    double descontoIR = calcularDescontoIR(salarioBruto);
                    descontosIR[i] = descontoIR;

                    double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
                    salariosLiquidos[i] = salarioLiquido;
             }


             System.out.println("\nResultados:");

             for (int i = 0; i < 5; i++) {
                    System.out.printf("Funcionário %d:\n", i + 1);
                    System.out.printf("Salário Bruto: R$ %.2f\n", salariosBrutos[i]);
                    System.out.printf("Desconto INSS: R$ %.2f\n", descontosINSS[i]);
                    System.out.printf("Desconto IR: R$ %.2f\n", descontosIR[i]);
                    System.out.printf("Salário Líquido: R$ %.2f\n", salariosLiquidos[i]);
                    System.out.println();
                }

                 scanner.close();
        }

    public static double calcularDescontoINSS(double salarioBruto) {
        double descontoINSS;

        if (salarioBruto <= 1212.00) {
            descontoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            descontoINSS = salarioBruto * 0.09;
        } else if (salarioBruto <= 3641.03) {
            descontoINSS = salarioBruto * 0.12;
        } else {
            descontoINSS = salarioBruto * 0.14;
        }

        return descontoINSS;
    }

    public static double calcularDescontoIR(double salarioBruto) {
        double descontoIR;

        if (salarioBruto <= 1903.98) {
            descontoIR = 0;
        } else if (salarioBruto <= 2826.65) {
            descontoIR = (salarioBruto * 0.075);
        } else if (salarioBruto <= 3751.05) {
            descontoIR = (salarioBruto * 0.15);
        } else if (salarioBruto <= 4664.68) {
            descontoIR = (salarioBruto * 0.225);
        } else {
            descontoIR = (salarioBruto * 0.275);
        }

        return descontoIR;
    }
}

