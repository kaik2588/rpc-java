package org.yzc.server;

/**
 * HTTP 服务接口
 */
public interface HttpServer {
    /**
     * 启动服务
     *
     * @param port
     */
    void doStart(int port);

}
