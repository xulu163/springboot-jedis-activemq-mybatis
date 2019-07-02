package com.xulu.demo.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import java.util.Map;

/**
 * @author xulu
 * @date 2019/7/2
 * @link https://github.com/xulu163
 */
@Component
public class TestMQComsumer {

    @JmsListener(destination = "my_msg")
    public void readMsg1(String text) {
        System.out.println("1接收到消息：" + text);
    }
    @JmsListener(destination = "my_msg")
    public void readMsg2(String text) {
        System.out.println("2接收到消息：" + text);
    }
    @JmsListener(destination = "my_msg")
    public void readMsg3(String text) {
        System.out.println("3接收到消息：" + text);
    }

    @JmsListener(destination = "my_map")
    public void readMap1(Map map) {
        System.out.println("1接收到map消息：" + map);
    }
    @JmsListener(destination = "my_map")
    public void readMap2(Map map) {
        System.out.println("2接收到map消息：" + map);
    }
    @JmsListener(destination = "my_map")
    public void readMap3(Map map) {
        System.out.println("3接收到map消息：" + map);
    }
}
