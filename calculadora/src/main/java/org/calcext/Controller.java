package org.calcext;

import io.javalin.http.Handler;
import java.lang.reflect.Method;

public class Controller {
    public static Handler realizeOperation = input -> {
        String op = input.pathParam("op");
        double a = Double.parseDouble(input.pathParam("a"));
        double b = Double.parseDouble(input.pathParam("b"));
        
        Object classInstance = Class.forName("org.calcext.operations."+op).getDeclaredConstructor().newInstance();
        Method operation = Class.forName("org.calcext.operations."+op).getDeclaredMethod("result", new Class[] {Double.class, Double.class});
        Object result = operation.invoke(classInstance, a, b);        

        input.json(result);
    };
}
