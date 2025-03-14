package org.boilerplate.ticketboxgatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.server.WebSocketService;
import org.springframework.web.reactive.socket.server.support.HandshakeWebSocketService;
import org.springframework.web.reactive.socket.server.upgrade.ReactorNettyRequestUpgradeStrategy;

@Configuration
public class WebsocketConfig {
    @Bean
    public WebSocketService webSocketService() {
        return new HandshakeWebSocketService(new ReactorNettyRequestUpgradeStrategy());
    }

    @Bean
    public WebSocketHandler echoHandler() {
        return session -> {
            return session.receive()
                    .map(WebSocketMessage::getPayloadAsText)
                    .map(session::textMessage)
                    .as(session::send);
        };
    }
}
