package com.rivergame;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.HandlerContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.xml.XmlConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author： guoqiang@rivergame.net
 * @date： 2024/2/1
 * @description： xml启动
 * @version: 1.0
 */
public class ServerXmlMain {
    public static final Logger logger = LoggerFactory.getLogger(ServerXmlMain.class);
    private static Server jettyServer = new Server();

    public static void main(String[] args) throws Exception {
        // 可以用 mvn jetty:run -Djetty.config=jetty.xml 启动
        //<Property name="jetty.base" default="." />/<Property name="jetty.deploy.monitoredDirName" default="target"/>
        // jetty.xml 中的monitoredDirName会扫描整个target中的文件和压缩包

        // 通过 XmlConfiguration 加载 jetty.xml 文件
        XmlConfiguration configuration = new XmlConfiguration(Resource.newResource("config/jetty.xml"));
        // 创建 Jetty 服务器
        configuration.configure(jettyServer);
        // 启动 Jetty 服务器
        jettyServer.start();
        jettyServer.join();
    }
}
