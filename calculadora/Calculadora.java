package calculadora;
import java.util.Scanner;
public class Calculadora{
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a operacao desejada: \t 1->Soma \t 2->Subtracao \t 3->Multiplicacao \t 4->Divisao");
        int operacao = scan.nextInt();

        switch (operacao){
            case 1:
                Soma soma = new Soma();
                soma.soma();
                break;
            case 2:
                Subtracao subtracao = new Subtracao();
                subtracao.subtracao();
                break;
            case 3:
                Multiplicacao multiplicacao = new Multiplicacao();
                multiplicacao.multiplicacao();
                break;
            case 4:
                Divisao divisao = new Divisao();
                divisao.divisao();
                break;
        }
    }
}