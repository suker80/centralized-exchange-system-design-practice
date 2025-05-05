package org.taegyu.crypto.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.Socket;

@Service
@RequiredArgsConstructor
public class RedisSubscriptionService {

    private final SocketBroadcastService broadcastService;

    public void handleSubscription(byte[] message) {
        broadcastService.broadcast(message);
    }
}
