package calculadora;
import java.util.Scanner;
public class Calculadora{
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a operacao desejada: \t 1->Soma \t 2->Subtracao \t 3->Multiplicacao \t 4->Divisao");
        int operacao = scan.nextInt();

        switch (operacao){
            case 1:
                OperacoesCalc soma = new OperacoesCalc();
                soma.soma();
                break;
            case 2:
                OperacoesCalc subtracao = new OperacoesCalc();
                subtracao.subtracao();
                break;
            case 3:
                OperacoesCalc multiplicacao = new OperacoesCalc();
                multiplicacao.multiplicacao();
                break;
            case 4:
                OperacoesCalc divisao = new OperacoesCalc();
                divisao.divisao();
                break;
        }
    }
}