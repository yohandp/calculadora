package org.calcext;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;

public class Calculadora{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, IOException {
        BasicConfigurator.configure();
        StringBuilder result = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        Server server = new Server();
        server.ServerRoutes();

        System.out.println("Digite a operação desejada(Padrões: Adicao, Subtracao, Multiplicacao, Divisao): ");
        String op = scan.nextLine();
        System.out.println("Digite o primeiro número: ");
        double a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = scan.nextDouble();

        scan.close();
        
        String reqUrl = "http://localhost:8000/" + op + "/" + String.valueOf(a) + "/" + String.valueOf(b);
        URL url = new URL(reqUrl);
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();

        result.append((char) is.read()); 
        
        System.out.println("Resultado é: " + result.toString());
    }    
}