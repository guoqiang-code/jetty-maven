package com.rivergame;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author： guoqiang@rivergame.net
 * @date： 2024/2/1
 * @description： 服务启动 不使用xml 纯代码配置
 * @version: 1.0
 */
public class ServerMain {
    public static void main(String[] args) throws Exception {
// 创建 Jetty 服务器
        Server server = new Server(10002);

        // 配置静态资源处理器
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setWelcomeFiles(new String[]{"index.html"});
        resourceHandler.setResourceBase("src/main/webapp");

        // 配置 Web 应用上下文
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setResourceBase("src/main/webapp");

        // 创建处理器列表
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[]{resourceHandler, webAppContext, new DefaultHandler()});

        // 设置服务器处理器
        server.setHandler(handlers);

        // 启动 Jetty 服务器
        server.start();
        server.join();
    }
}
