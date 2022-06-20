package org.calcext;

import io.javalin.Javalin;

public class Server {
    public void ServerRoutes(){
        Javalin app = Javalin.create().start(8000);
        app.get("/{op}/{a}/{b}", Controller.realizeOperation);
    }
}
