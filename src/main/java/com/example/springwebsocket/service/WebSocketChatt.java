package com.example.springwebsocket.service;

import org.springframework.stereotype.Service;

import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
@ServerEndpoint(value="/chatt")
public class WebSocketChatt {
    private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());
}
