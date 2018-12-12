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
        ConcertTicket twentyonepilots = new ConcertTicket("Twenty One Pilots", "9/13/19", "Greek Theatre", 10, 30.00, "Test");
        ConcertTicket eminem = new ConcertTicket("Eminem","10/13/19", "Civic Center", 10, 30.00, "Test");
        // ConcertTicket thestrokes = new ConcertTicket(new Artist("The Strokes"), new Date("1/13/19"), new Venue("SAP Center"), 10, 30.00, "Test");
        // ConcertTicket tameimpala = new ConcertTicket(new Artist("Tame Impala"), new Date("3/4/19"), new Venue("Fox Theater"), 10, "Test");
        // ConcertTicket martingarrix = new ConcertTicket(new Artist("Martin Garrix"), new Date("1/2/19"), new Venue("The Regency Ballroom"), 10, 30.00, "Test");
        // ConcertTicket ICP = new ConcertTicket(new Artist("Insane Clown Posse"), new Date("5/26/19"), new Venue("Shoreline Ampitheatre"), 10, 30.00, "Test");
        // ConcertTicket cagetheelephant = new ConcertTicket(new Artist("Cage The Elephant"), new Date("1/2/19"), new Venue("The Regency Ballroom"), 10, 30.00, "Test");
        // ConcertTicket kendricklamar = new ConcertTicket(new Artist("Kendrick Lamar"), new Date("12/6/18"), new Venue("The Regency Ballroom"), 10, 30.00, "Test");


        ticketRepo.deleteAll();
        List<ConcertTicket> concerts = Arrays.asList(twentyonepilots, eminem);
        // List<ConcertTicket> concerts = Arrays.asList(twentyonepilots, eminem, thestrokes, tameimpala, martingarrix, ICP, cagetheelephant, kendricklamar);
        ticketRepo.saveAll(concerts);
    }

}