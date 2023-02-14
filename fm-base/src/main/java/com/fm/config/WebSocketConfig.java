package com.fm.config;

import com.fm.config.filter.WebsocketFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Description: WebSocketConfig
 *
 */
@Configuration
public class WebSocketConfig {
    /**
     * 	注入ServerEndpointExporter，
     * 	这个bean会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean
    public WebsocketFilter websocketFilter(){
        return new WebsocketFilter();
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(websocketFilter());
        //TODO 临时注释掉，测试下线上socket总断的问题
        bean.addUrlPatterns("/websocket/*","/eoaSocket/*", "/newsWebsocket/*", "/vxeSocket/*");
        return bean;
    }

}