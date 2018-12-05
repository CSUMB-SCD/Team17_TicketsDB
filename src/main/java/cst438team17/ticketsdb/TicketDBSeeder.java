package cst438team17.ticketsdb;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cst438team17.ticketsdb.entities.Artist;
import cst438team17.ticketsdb.entities.ConcertTicket;
import cst438team17.ticketsdb.entities.Date;
import cst438team17.ticketsdb.entities.Venue;

@Component
public class TicketDBSeeder implements CommandLineRunner{
    @Autowired
    ITicketRespository ticketRepo;

    @Override
    public void run(String... args) throws Exception {
        ConcertTicket twentyonepilots = new ConcertTicket(new Artist("Twenty One Pilots"), new Date("9/13/19"), new Venue("Greek Theatre"), 10);
        ConcertTicket eminem = new ConcertTicket(new Artist("Eminem"), new Date("10/13/19"), new Venue("Civic Center"), 10);
        ConcertTicket thestrokes = new ConcertTicket(new Artist("The Strokes"), new Date("1/13/19"), new Venue("SAP Center"), 10);
        ConcertTicket tameimpala = new ConcertTicket(new Artist("Tame Impala"), new Date("3/4/19"), new Venue("Fox Theater"), 10);
        ConcertTicket martingarrix = new ConcertTicket(new Artist("Martin Garrix"), new Date("1/2/19"), new Venue("The Regency Ballroom"), 10);
        ticketRepo.deleteAll();
        List<ConcertTicket> concerts = Arrays.asList(twentyonepilots, eminem, thestrokes, tameimpala, martingarrix);
        ticketRepo.saveAll(concerts);
    }

}