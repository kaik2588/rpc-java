package org.yzc;

import org.yzc.common.service.UserService;
import org.yzc.registry.LocalRegisrty;
import org.yzc.server.HttpServer;
import org.yzc.server.UserServiceImpl;
import org.yzc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String [] args){

        LocalRegisrty.register(UserService.class.getName(), UserServiceImpl.class);
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
