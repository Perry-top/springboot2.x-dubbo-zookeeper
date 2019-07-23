package com.perry.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service//将服务发布出去 import com.alibaba.dubbo.config.annotation.Service;
public class TicketerviceImp implements TicketService {
    @Override
    public String getTicket() {
        return "《电影》";
    }
}
