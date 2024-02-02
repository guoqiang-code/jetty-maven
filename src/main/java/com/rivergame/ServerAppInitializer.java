package com.rivergame;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author： guoqiang@rivergame.net
 * @date： 2024/2/1
 * @description：
 * @version: 1.0
 */
public class AppInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 在这里执行服务启动时的初始化逻辑
        System.out.println("Service initialization completed.");

        // 示例：加载配置文件
        // ConfigurationLoader.loadConfig();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // 在这里执行服务关闭时的清理逻辑
        System.out.println("Service shutdown completed.");
    }
}
