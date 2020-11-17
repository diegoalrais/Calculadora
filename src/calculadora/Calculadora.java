package calculadora;

import java.util.Scanner;

/**
 * @author diego
 */
public class Calculadora {
    
    public static double somar(double n1, double n2){
        double resultado;
        resultado = n1 + n2;
        System.out.println("A soma dos números é igual a: "+ resultado);
        return 0;
    }
    public static double subtrair(double n1, double n2){
        double resultado;
        resultado = n1 - n2;
        System.out.println("A subtração dos números é igual a: "+ resultado);
        return 0;
    }
    public static double multiplicar(double n1, double n2){
        double resultado;
        resultado = n1 * n2; 
        System.out.println("A multiplicação dos números é igual a: "+ resultado);
        return 0;
    }
    public static  double dividir(double n1, double n2){
       double resultado;
       resultado = n1 / n2;
       System.out.println("A divisão dos números é igual a: "+ resultado);
       return 0;
    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1;
        double n2;
        int op;
        
        do {
            System.out.println("Observe as operações: [1] Somar; [2] Subtrair; [3] Multiplicar; [4] Dividir; [0] Encerrar o programa.");
            System.out.println("Digite o número da Operação desejada: ");
            op = scan.nextInt();
            switch(op){
                case 0:
                    System.out.println("Programa encerrado com sucesso!");
                break;
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = scan.nextDouble();
                    somar(n1, n2);
                    System.out.println("---------------------------------------------------");
                break;
                case 2:
                    System.out.println("Digite o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = scan.nextDouble();
                    subtrair(n1, n2);
                    System.out.println("---------------------------------------------------");
                break;
                case 3:
                    System.out.println("Digite o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = scan.nextDouble();
                    multiplicar(n1, n2);
                    System.out.println("---------------------------------------------------");
                break;
                case 4:
                    System.out.println("Digite o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = scan.nextDouble();
                    dividir(n1, n2);
                    System.out.println("---------------------------------------------------");
                break;
                default:
                    System.out.println("Opção inválida. Tente outra opção.");
            } 
        } while(op != 0);
    }
}