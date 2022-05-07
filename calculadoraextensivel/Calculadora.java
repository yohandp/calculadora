package calculadoraextensivel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a operação desejada(Padrões: Adicao, Subtracao, Multiplicacao, Divisao): ");
        String op = scan.nextLine();
        System.out.println("Digite o primeiro número: ");
        double a = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o segundo número: ");
        double b = Double.parseDouble(scan.nextLine());
        scan.close();

        Object classInstance = Class.forName("calculadoraextensivel."+op).getDeclaredConstructor().newInstance();
        Method operation = Class.forName("calculadoraextensivel."+op).getDeclaredMethod("result", new Class[] {Double.class, Double.class});
        operation.invoke(classInstance, a, b);
    }    
}