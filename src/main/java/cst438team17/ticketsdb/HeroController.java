package cst438team17.ticketsdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cst438team17.ticketsdb.entities.ConcertTicket;

@RestController
public class HeroController {
    @Autowired
    ITicketRespository ticketRepo;

    @GetMapping ("/allTickets")
    public List<ConcertTicket> getAll() {
        List<ConcertTicket> result = ticketRepo.findAll();
        return result;
    }

}