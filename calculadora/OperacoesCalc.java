package calculadora;

import java.util.Scanner;

public class OperacoesCalc{
    public void soma(){
        Scanner scan = new Scanner(System.in);
        double n1, n2, resultado;
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextDouble();
        resultado = n1+n2;
        System.out.println("O resultado da soma eh: " + resultado);
    }

    public void subtracao(){
        Scanner scan = new Scanner(System.in);
        double n1, n2, resultado;
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextDouble();
        resultado = n1-n2;
        System.out.println("O resultado da subtracao eh: " + resultado);
    }

    public void multiplicacao(){
        Scanner scan = new Scanner(System.in);
        double n1, n2, resultado;
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextDouble();
        resultado = n1*n2;
        System.out.println("O resultado da multiplicacao eh: " + resultado);
    }

    public void divisao(){
        Scanner scan = new Scanner(System.in);
        double n1, n2, resultado;
        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextDouble();
        resultado = n1/n2;
        System.out.println("O resultado da divisao eh: " + resultado);
    }

}
