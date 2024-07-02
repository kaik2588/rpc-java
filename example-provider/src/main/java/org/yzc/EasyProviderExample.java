package org.yzc;

import org.yzc.server.HttpServer;
import org.yzc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String [] args){
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
