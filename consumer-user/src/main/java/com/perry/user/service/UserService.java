package com.perry.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.perry.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void getProviderTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("买到了:"+ticket);
    }

}
