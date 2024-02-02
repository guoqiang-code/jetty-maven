package com.rivergame;

import org.eclipse.jetty.server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author： guoqiang@rivergame.net
 * @date： 2024/2/1
 * @description：
 * @version: 1.0
 */
public class ServerAppInitializer implements ServletContextListener {
    public final Logger logger = LoggerFactory.getLogger(ServerAppInitializer.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 在这里执行服务启动时的初始化逻辑
        logger.info("Service initialization completed.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // 在这里执行服务关闭时的清理逻辑
        logger.info("Service shutdown completed.");
    }
}
