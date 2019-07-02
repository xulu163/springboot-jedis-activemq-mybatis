package com.xulu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xulu
 * @date 2019/7/2
 * @link https://github.com/xulu163
 */
@Service
public class MqProducerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMsg(String msg) {
        jmsMessagingTemplate.convertAndSend("my_msg", msg);
        System.out.println("msg发送成功");
    }

    public void sendMap() {
        Map map = new HashMap();
        map.put("mobile", "13888888888");
        map.put("content", "王总喜提兰博基尼");
        jmsMessagingTemplate.convertAndSend("my_map", map);
        System.out.println("map发送成功");
    }
}
