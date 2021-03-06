package com.up.frontweb.WebSocket;

import com.up.frontweb.WebSocket.bean.Greeting;
import com.up.frontweb.WebSocket.bean.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }
    @RequestMapping("/chat")
    public String chat(){

        return "weChat";
//        return "redirect:/weChat.html";
    }
}
